package com.odiy.domain.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.odiy.domain.mapper.common.CommonMapper;
import com.odiy.domain.mapper.j99.mapper.ManaColorMapper;
import com.odiy.domain.mapper.j99.mapper.OptionTempMapper;
import com.odiy.domain.mapper.j99.mapper.ShopAdditionInfoMapper;
import com.odiy.domain.mapper.j99.mapper.ShopBaseInfoMapper;
import com.odiy.domain.mapper.j99.mapper.ShopItemMapper;
import com.odiy.domain.mapper.j99.mapper.TagMapper;
import com.odiy.domain.mapper.j99.model.ManaColor;
import com.odiy.domain.mapper.j99.model.ManaColorExample;
import com.odiy.domain.mapper.j99.model.OptionTemp;
import com.odiy.domain.mapper.j99.model.OptionTempExample;
import com.odiy.domain.mapper.j99.model.ShopAdditionInfo;
import com.odiy.domain.mapper.j99.model.ShopAdditionInfoExample;
import com.odiy.domain.mapper.j99.model.ShopBaseInfo;
import com.odiy.domain.mapper.j99.model.ShopBaseInfoExample;
import com.odiy.domain.mapper.j99.model.ShopItem;
import com.odiy.domain.mapper.j99.model.ShopItemExample;
import com.odiy.domain.mapper.j99.model.Tag;
import com.odiy.domain.mapper.j99.model.TagExample;

@Service
public class MemberShopServiceImpl implements MemberShopService {

	@Inject
	ShopBaseInfoMapper shopBaseInfoMapper;
	
	@Inject
	ShopAdditionInfoMapper shopAdditionInfoMapper;

	@Inject
	ShopItemMapper shopItemMapper;

	@Inject
	ManaColorMapper manaColorMapper;

	@Inject
	CommonMapper commonMapper;

	@Inject
	TagMapper tagMapper;

	@Inject
	OptionTempMapper optionTempMapper;

	@Override
	public ShopBaseInfo createOrUpdateShopInfo(int memberID, ShopBaseInfo shopBaseInfo) {
		ShopBaseInfoExample example = new ShopBaseInfoExample();
		example.createCriteria().andMemberIdEqualTo(memberID);
		List<ShopBaseInfo> list = shopBaseInfoMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			shopBaseInfo.setShopId(list.get(0).getShopId());
			shopBaseInfo.setAddDate(list.get(0).getAddDate());
			shopBaseInfo.setMemberId(memberID);
			shopBaseInfoMapper.updateByPrimaryKey(shopBaseInfo);
		} else {
			shopBaseInfo.setAddDate( LocalDateTime.now());
			shopBaseInfo.setMemberId(memberID);
			shopBaseInfoMapper.insert(shopBaseInfo);
		}

		return shopBaseInfo;

	}

	@Override
	public ShopBaseInfo selectMemberShop(int memberID) {
		ShopBaseInfoExample example = new ShopBaseInfoExample();
		example.createCriteria().andMemberIdEqualTo(memberID);
		List<ShopBaseInfo> list = shopBaseInfoMapper.selectByExample(example);

		return list != null && list.size() > 0 ? list.get(0) : null;
	}
	
	@Override
	public ShopAdditionInfo selecctShopAdditionInfo(final Integer shopId) {
		ShopAdditionInfoExample example = new ShopAdditionInfoExample();
		example.createCriteria().andShopIdEqualTo(shopId);
		example.setOrderByClause("VER DESC");
		List<ShopAdditionInfo> result = shopAdditionInfoMapper.selectByExample(example);
		return result != null && result.size() > 0 ?  result.get(0) : null;
	}

	@Override
	public void saveShopAdditionInfo(final int memberID, final Integer shopId, final ShopAdditionInfo shopAdditionInfo) {
		final Optional<ShopAdditionInfo> shopAdditionInfoLast = Optional.ofNullable(selecctShopAdditionInfo(shopId));
		if (shopAdditionInfoLast.isPresent() && shopAdditionInfoLast.get().getVer().equals(shopAdditionInfo.getVer())) {
			ShopAdditionInfo updateAdditionInfo = shopAdditionInfoLast.get();
			updateAdditionInfo.setUpdateDatetime(LocalDateTime.now());
			updateAdditionInfo.setUpdateMemberId(memberID);
			updateAdditionInfo.setValue(shopAdditionInfo.getValue());
			shopAdditionInfoMapper.updateByPrimaryKeySelective(updateAdditionInfo);
		} else {
			shopAdditionInfoLast.ifPresentOrElse(x->{shopAdditionInfo.setVer(x.getVer()+1);}, ()->{
				shopAdditionInfo.setVer(0);
			});
			shopAdditionInfo.setUpdateDatetime(LocalDateTime.now());
			shopAdditionInfo.setUpdateMemberId(memberID);
			shopAdditionInfoMapper.insert(shopAdditionInfo);
		}
	}
	// TODO deleteは不正、Insert と Updata と deleteに修正必要, IDは固定しないと
	@Override
	public List<ShopItem> savaShopItem(int memberID, List<ShopItem> record) {

		ShopBaseInfo shopBaseInfo = selectMemberShop(memberID);
		if (shopBaseInfo == null) {
			return null;
		}

		ShopItemExample example = new ShopItemExample();
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId());
		shopItemMapper.deleteByExample(example);

		int i = 1;
		for (ShopItem shopItem : record) {
			shopItem.setShopId(shopBaseInfo.getShopId());
			shopItem.setOrderIndex(i++);
			shopItemMapper.insert(shopItem);
		}
		example.setOrderByClause("ORDER_INDEX");

		return shopItemMapper.selectByExample(example);

	}

	@Override
	public void deleteShopItem(int memberID, ShopItem shopItem) {
		if (shopItem == null || shopItem.getId() == null) {
			return;
		}
		ShopBaseInfo shopBaseInfo = selectMemberShop(memberID);
		if (shopBaseInfo == null) {
			return;
		}

		ShopItemExample example = new ShopItemExample();
		example.createCriteria().andShopIdEqualTo(shopItem.getShopId()).andIdEqualTo(shopItem.getId());
		shopItemMapper.deleteByExample(example);
	}

	@Override
	public List<ShopItem> savaShopItem(int memberID, ShopItem shopItem) {
		ShopBaseInfo shopBaseInfo = selectMemberShop(memberID);
		if (shopBaseInfo == null) {
			return null;
		}
		boolean isInsert = false;
		ShopItem update = null;
		if (!StringUtils.isEmpty(shopItem.getId())) {
			ShopItemExample example = new ShopItemExample();
			example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId()).andIdEqualTo(shopItem.getId());
			List<ShopItem> shopItemlist = shopItemMapper.selectByExample(example);
			if (shopItemlist == null || shopItemlist.size() < 1) {
				isInsert = true;
			} else {
				update = shopItemlist.get(0);
			}
		} else {
			isInsert = true;
		}
		if (isInsert) {
			shopItem.setShopId(shopBaseInfo.getShopId());
			shopItem.setOrderIndex(9999);
			shopItemMapper.insert(shopItem);
		} else {
			update.setItemDescr(shopItem.getItemDescr());
			update.setItemDispDetail(shopItem.getItemDispDetail());
			update.setItemMainPicUrl(shopItem.getItemMainPicUrl());
			update.setItemName(shopItem.getItemName());
			update.setItemPrice(shopItem.getItemPrice());
			ShopItemExample example = new ShopItemExample();
			example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId());
			shopItemMapper.updateByPrimaryKey(update);
		}

		ShopItemExample example = new ShopItemExample();
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId());
		example.setOrderByClause("ORDER_INDEX");
		return shopItemMapper.selectByExample(example);

	}

	@Override
	public List<ShopItem> selectShopItem(int memberID) {
		ShopBaseInfo shopBaseInfo = selectMemberShop(memberID);
		if (shopBaseInfo == null) {
			return null;
		}
		ShopItemExample example = new ShopItemExample();
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId());
		// example.setOrderByClause("ORDER_INDEX");
		return shopItemMapper.selectByExample(example);
	}

	@Override
	public List<ManaColor> selectManaColor(int memberID) {
		ShopBaseInfo shopBaseInfo = selectMemberShop(memberID);
		if (shopBaseInfo == null) {
			return null;
		}
		ManaColorExample example = new ManaColorExample();
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId());
		// example.setOrderByClause("ID");

		return manaColorMapper.selectByExample(example);

	}

	@Override
	public ManaColor saveManaColor(int memberID, ManaColor manaColor) {
		Integer tempId = 1; // TODO
		ShopBaseInfo shopBaseInfo = selectMemberShop(memberID);
		if (shopBaseInfo == null || manaColor == null) {
			return null;
		}

		ManaColorExample example = new ManaColorExample();
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId()).andTempIdEqualTo(tempId)
				.andIdEqualTo(manaColor.getId());

		List<ManaColor> mcl = manaColorMapper.selectByExample(example);

		if (manaColor.getId() != null && mcl.size() > 0) {
			manaColor.setShopId(shopBaseInfo.getShopId());
			manaColorMapper.updateByPrimaryKey(manaColor);

		} else {
			final Integer id = commonMapper.getMaxManaColorID(tempId, shopBaseInfo.getShopId());
			manaColor.setId(id == null ? 1 : id + 1);
			manaColor.setShopId(shopBaseInfo.getShopId());
			manaColor.setTempId(tempId);
			manaColorMapper.insert(manaColor);

		}
		System.out.println(manaColor == null ? "" : manaColor.toString());
		return manaColor;
	}

	@Override
	public void deleteManaColor(int memberID, ManaColor manaColor) {
		Integer tempId = 1; // TODO
		ShopBaseInfo shopBaseInfo = selectMemberShop(memberID);
		if (shopBaseInfo == null || manaColor == null) {
			return;
		}

		ManaColorExample example = new ManaColorExample();
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId()).andTempIdEqualTo(tempId)
				.andIdEqualTo(manaColor.getId());

		manaColorMapper.deleteByExample(example);

		return;
	}

	@Override
	public List<Tag> getTags(int memberID) {
		ShopBaseInfo shopBaseInfo = selectMemberShop(memberID);
		if (shopBaseInfo == null) {
			return null;
		}

		TagExample example = new TagExample();
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId());
		example.setOrderByClause("ORDERS");
		return tagMapper.selectByExample(example);
	}

	@Override
	public void setTags(int memberID, List<Tag> tags) {
		ShopBaseInfo shopBaseInfo = selectMemberShop(memberID);
		if (shopBaseInfo == null) {
			return;
		}

		TagExample example = new TagExample();
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId());

		List<Tag> dbtags = tagMapper.selectByExample(example);
		if (tags == null || tags.size() == 0) {
			tagMapper.deleteByExample(example);
		} else {
			if (dbtags != null && dbtags.size() > 0) {
				for (Tag tagdb : dbtags) {
					boolean have = false;
					for (Tag tag : dbtags) {
						if (tagdb.getId() == tag.getId()) {
							have = true;
							break;
						}
					}
					if (!have) {
						TagExample example2 = new TagExample();
						example2.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId())
								.andIdEqualTo(tagdb.getId());
						tagMapper.deleteByExample(example2);
					}

				}
			}
		}

		int i = 0;
		for (Tag tag : tags) {
			tag.setShopId(shopBaseInfo.getShopId());
			tag.setOrders(i++);
			if (tag.getId() == null || tag.getId() == 0) {
				tag.setId(null);
				tagMapper.insert(tag);
			} else {
				TagExample example2 = new TagExample();
				example2.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId()).andIdEqualTo(tag.getId());
				tagMapper.updateByExample(tag, example2);
			}
		}

	}

	@Override
	public List<OptionTemp> getOptinTemps(int memberID) {
		ShopBaseInfo shopBaseInfo = selectMemberShop(memberID);
		if (shopBaseInfo == null) {
			return null;
		}

		OptionTempExample example = new OptionTempExample();
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId());
		example.setOrderByClause("ORDERS");
		return optionTempMapper.selectByExample(example);
	}

	@Override
	public void setOptinTemps(int memberID, List<OptionTemp> optionTemps) {
		ShopBaseInfo shopBaseInfo = selectMemberShop(memberID);
		if (shopBaseInfo == null) {
			return;
		}

		OptionTempExample example = new OptionTempExample();
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId());

		List<OptionTemp> dbots = optionTempMapper.selectByExample(example);
		if (optionTemps == null || optionTemps.size() == 0) {
			optionTempMapper.deleteByExample(example);
		} else {
			if (dbots != null && dbots.size() > 0) {
				for (OptionTemp otdb : dbots) {
					boolean have = false;
					for (OptionTemp ot : dbots) {
						if (otdb.getId() == ot.getId()) {
							have = true;
							break;
						}
					}
					if (!have) {
						OptionTempExample example2 = new OptionTempExample();
						example2.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId()).andIdEqualTo(otdb.getId());
						optionTempMapper.deleteByExample(example2);
					}
				}
			}
		}

		int i = 0;
		for (OptionTemp optionTemp : optionTemps) {
			optionTemp.setShopId(shopBaseInfo.getShopId());

			optionTemp.setOrders(i++);
			if (optionTemp.getId() == null || optionTemp.getId() == 0) {
				optionTemp.setId(null);
				optionTempMapper.insert(optionTemp);
			} else {
				OptionTempExample example2 = new OptionTempExample();
				example2.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId()).andIdEqualTo(optionTemp.getId());
				optionTempMapper.updateByExample(optionTemp, example2);
			}

		}

	}

}
