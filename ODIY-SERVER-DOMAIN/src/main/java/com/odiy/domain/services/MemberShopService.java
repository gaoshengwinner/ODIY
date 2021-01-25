package com.odiy.domain.services;

import java.util.List;

import com.odiy.domain.mapper.j99.model.ManaColor;
import com.odiy.domain.mapper.j99.model.ShopBaseInfo;
import com.odiy.domain.mapper.j99.model.ShopItem;
import com.odiy.domain.mapper.j99.model.Tag;

public interface MemberShopService {


	ShopBaseInfo createOrUpdateShopInfo(int memberID, ShopBaseInfo shopBaseInfo);
	
	ShopBaseInfo selectMemberShop(int memberID);

	List<ShopItem> savaShopItem(int memberID, List<ShopItem> record);

	List<ShopItem> selectShopItem(int memberID);

	List<ShopItem> savaShopItem(int memberID, ShopItem shopItem);
	
	List<ManaColor> selectManaColor(int memberID);

	ManaColor saveManaColor(int memberID, ManaColor manaColor);

	void deleteManaColor(int memberID, ManaColor manaColor);

	void deleteShopItem(int memberID, ShopItem shopItem);

	List<Tag> getTags(int memberID);

	void setTags(int memberID, List<Tag> tags);

}
