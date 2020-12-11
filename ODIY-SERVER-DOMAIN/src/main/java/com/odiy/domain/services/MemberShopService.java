package com.odiy.domain.services;

import java.util.List;

import com.odiy.domain.mapper.j99.model.ShopBaseInfo;
import com.odiy.domain.mapper.j99.model.ShopItem;

public interface MemberShopService {


	ShopBaseInfo createOrUpdateShopInfo(int memberID, ShopBaseInfo shopBaseInfo);
	
	ShopBaseInfo selectMemberShop(int memberID);

	List<ShopItem> savaShopItem(int memberID, List<ShopItem> record);

	List<ShopItem> selectShopItem(int memberID);

	List<ShopItem> savaShopItem(int memberID, ShopItem shopItem);

}
