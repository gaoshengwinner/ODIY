package com.odiy.domain.services;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.odiy.domain.mapper.j99.mapper.ShopBaseInfoMapper;
import com.odiy.domain.mapper.j99.mapper.ShopItemMapper;
import com.odiy.domain.mapper.j99.model.ShopBaseInfo;
import com.odiy.domain.mapper.j99.model.ShopBaseInfoExample;
import com.odiy.domain.mapper.j99.model.ShopItem;
import com.odiy.domain.mapper.j99.model.ShopItemExample;

@Service
public class MemberShopServiceImpl implements MemberShopService {

	@Inject
	ShopBaseInfoMapper shopBaseInfoMapper;

	@Inject
	ShopItemMapper shopItemMapper;

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
			shopBaseInfo.setAddDate(new Date());
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
		example.setOrderByClause("ORDER_INDEX");
		return shopItemMapper.selectByExample(example);
	}

}
