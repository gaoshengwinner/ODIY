package com.odiy.domain.services;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.odiy.domain.mapper.common.CommonMapper;
import com.odiy.domain.mapper.j99.mapper.ManaColorMapper;
import com.odiy.domain.mapper.j99.mapper.ShopBaseInfoMapper;
import com.odiy.domain.mapper.j99.mapper.ShopItemMapper;
import com.odiy.domain.mapper.j99.mapper.TagMapper;
import com.odiy.domain.mapper.j99.model.ManaColor;
import com.odiy.domain.mapper.j99.model.ManaColorExample;
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
	ShopItemMapper shopItemMapper;
	
	@Inject
	ManaColorMapper  manaColorMapper;
	
	@Inject
	CommonMapper commonMapper;
	
	@Inject
	TagMapper tagMapper;

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
		//example.setOrderByClause("ORDER_INDEX");
		return shopItemMapper.selectByExample(example);
	}
	
	@Override
	public List<ManaColor> selectManaColor(int memberID){
		ShopBaseInfo shopBaseInfo = selectMemberShop(memberID);
		if (shopBaseInfo == null) {
			return null;
		}
		ManaColorExample example = new ManaColorExample();
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId());
		//example.setOrderByClause("ID");
		
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
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId())
		.andTempIdEqualTo(tempId)
		.andIdEqualTo(manaColor.getId());
		
		List<ManaColor>  mcl = manaColorMapper.selectByExample(example);
		
		if (manaColor.getId() != null && mcl.size() > 0) {
			manaColor.setShopId(shopBaseInfo.getShopId());
			manaColorMapper.updateByPrimaryKey(manaColor);
			
		} else {
			final Integer id = commonMapper.getMaxManaColorID(tempId, shopBaseInfo.getShopId());
			manaColor.setId(id == null ? 1  : id + 1);
			manaColor.setShopId(shopBaseInfo.getShopId());
			manaColor.setTempId(tempId);
			manaColorMapper.insert(manaColor);
			
		}
		System.out.println(manaColor == null? "": manaColor.toString());
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
		example.createCriteria().andShopIdEqualTo(shopBaseInfo.getShopId())
		.andTempIdEqualTo(tempId)
		.andIdEqualTo(manaColor.getId());
		
		manaColorMapper.deleteByExample(example);
		
		return;
	}
	@Override
	public List<Tag> getTags(int memberID){
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
		
		tagMapper.deleteByExample(example);
		
		int i=0;
		for(Tag tag : tags) {
			tag.setShopId(shopBaseInfo.getShopId());
			tag.setId(null);
			tag.setOrders(i++);
			tagMapper.insert(tag);
		}
		
	}
	

}
