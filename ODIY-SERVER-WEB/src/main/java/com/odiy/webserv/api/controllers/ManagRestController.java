package com.odiy.webserv.api.controllers;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odiy.domain.common.beans.UserInfo;
import com.odiy.domain.common.exceptions.AuthotionException;
import com.odiy.domain.mapper.j99.model.ShopBaseInfo;
import com.odiy.domain.mapper.j99.model.ShopItem;
import com.odiy.domain.mapper.j99.model.UserToken;
import com.odiy.domain.services.MemberRegistService;
import com.odiy.domain.services.MemberRegistServiceImpl;
import com.odiy.domain.services.MemberShopService;
import com.odiy.webserv.api.resouce.ApiResult;
import com.odiy.webserv.api.resouce.LoginResult;
import com.odiy.webserv.api.resouce.RefreshTokenResult;
import com.odiy.webserv.api.resouce.ShopInfoRestResult;
import com.odiy.webserv.api.resouce.ShopItemResult;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ManagRestController {
	public static final String AUTHON_REFRESH_HEADER = "AUTHON_REFRESH_HEADER";
	public static final String AUTHON_ACCESS_HEADER = "AUTHON_ACCESS_HEADER";
	
	@Inject
	private MemberRegistService memberRegistService;
	
	@Inject
	private MemberShopService memberShopService;
	
	@RequestMapping(path = "/v1/api/manag/refreshToken")
	public RefreshTokenResult refreshToken(HttpServletResponse response, @RequestHeader(AUTHON_REFRESH_HEADER) String refreshToken) {
		log.info("/v1/api/manag/refreshToken start");
	
		try {
			UserToken ut = memberRegistService.refreshToken(refreshToken);
			return RefreshTokenResult.builder().statu("0")
					.accessToken(ut.getAccessToken())
					.accessTokenLimit(MemberRegistServiceImpl.ACCCESSTOKENLIMIT)
					.build();
		} catch (AuthotionException e) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return RefreshTokenResult.builder().statu("-1").err(e.getMessage()).build();
			
		}
	}

	@RequestMapping(path = "/v1/api/manag/shopInfo")
	public ShopInfoRestResult getShopInfo(UserInfo userInfo) {
		
		ShopBaseInfo shopBaseInfo = memberShopService.selectMemberShop(userInfo.getMemberID());
		
		if (shopBaseInfo != null) {
			return ShopInfoRestResult.builder().shopName(shopBaseInfo.getShopName())
			.shopAddr(shopBaseInfo.getShopAddr())
			.shopTel(shopBaseInfo.getShopTel())
			.shopPicUrl(shopBaseInfo.getShopPicUrl())
			.build();
		}
		return ShopInfoRestResult.builder().build();
	}
	
	@RequestMapping(path = "/v1/api/manag/save_shopInfo")
	public ApiResult saveShopeInfo(@RequestBody @Validated ShopInfoRestResult shopInfo, BindingResult rs,UserInfo userInfo,HttpServletResponse response) {
		
		if (rs.hasErrors()) {
			final ApiResult r = ApiResult.builder().build();
			// log.warn(rs.getAllErrors().toString());
			rs.getAllErrors().forEach(ob -> {
				r.addErrInfo(((FieldError) ob).getField(), ob.getDefaultMessage());
			});
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return r;

		}
		
		
		memberShopService.createOrUpdateShopInfo(userInfo.getMemberID(), 
				ShopBaseInfo.builder().shopName(shopInfo.getShopName())
				.shopAddr(shopInfo.getShopAddr())
				.shopTel(shopInfo.getShopTel())
				.shopPicUrl(shopInfo.getShopPicUrl())
				.build()
				);
		
		return ApiResult.builder().build();
	}
	
	@RequestMapping(path = "/v1/api/manag/shopItemInfo")
	public List<ShopItemResult> getShopItems(UserInfo userInfo) {
		List<ShopItem> list = memberShopService.selectShopItem(userInfo.getMemberID());
		List<ShopItemResult> result = new ArrayList<ShopItemResult>();
		if (list != null) {
			for (ShopItem shopItem : list) {
				result.add(ShopItemResult.builder()
				.id(shopItem.getId())
				.itemName(shopItem.getItemName() == null ? "" : shopItem.getItemName())
				.itemPrice(NumberFormat.getInstance().format(shopItem.getItemPrice()))
				.itemMainPicUrl(shopItem.getItemMainPicUrl() == null ? "" : shopItem.getItemMainPicUrl())
				.itemDescr(shopItem.getItemDescr() == null ? "" : shopItem.getItemDescr())
				.itemDispDetail(shopItem.getItemDispDetail())
				.build());
				
			}
		}
		return result;
	}
	
	@RequestMapping(path = "/v1/api/manag/shopItemInfoRow")
	public List<ShopItemResult> saveShopItem(UserInfo userInfo, @RequestBody ShopItemResult shopItemResult) {
		ShopItem shopItem  = ShopItem.builder().id(shopItemResult.getId())
				.itemName(shopItemResult.getItemName())
				.itemDescr(shopItemResult.getItemDescr())
				.itemPrice(Integer.valueOf(shopItemResult.getItemPrice().replace(",", "")))
				.itemMainPicUrl(shopItemResult.getItemMainPicUrl())
				.itemDispDetail(shopItemResult.getItemDispDetail())
				.build();
		
		List<ShopItem> record = memberShopService.savaShopItem(userInfo.getMemberID(), shopItem);
		
		List<ShopItemResult> result = new ArrayList<ShopItemResult>();
		if (record != null) {
			for (ShopItem si : record) {
				result.add(ShopItemResult.builder()
				.id(si.getId())
				.itemName(si.getItemName() == null ? "" : si.getItemName())
				.itemPrice(NumberFormat.getInstance().format(si.getItemPrice()))
				.itemMainPicUrl(si.getItemMainPicUrl() == null ? "" : si.getItemMainPicUrl())
				.itemDescr(si.getItemDescr() == null ? "" : si.getItemDescr())
				.itemDispDetail(si.getItemDispDetail() == null ? "" : si.getItemDispDetail())
				.build());
				
			}
		}
		return result;
		
	}
	
	@RequestMapping(path = "/v1/api/manag/save_shopItemInfo")
	public List<ShopItemResult> saveShopItems(UserInfo userInfo, @RequestBody List<ShopItemResult> lst) {
		List<ShopItem> record = new ArrayList<ShopItem>();
		log.info(lst.toString());
		for (ShopItemResult shopItemResult : lst) {
			record.add(
			ShopItem.builder().id(shopItemResult.getId())
			.itemName(shopItemResult.getItemName())
			.itemDescr(shopItemResult.getItemDescr())
			.itemPrice(Integer.valueOf(shopItemResult.getItemPrice().replace(",", "")))
			.itemMainPicUrl(shopItemResult.getItemMainPicUrl())
			.itemDispDetail(shopItemResult.getItemDispDetail())
			.build()
			);
		}
		record = memberShopService.savaShopItem(userInfo.getMemberID(), record);
		List<ShopItemResult> result = new ArrayList<ShopItemResult>();
		if (record != null) {
			for (ShopItem shopItem : record) {
				result.add(ShopItemResult.builder()
				.id(shopItem.getId())
				.itemName(shopItem.getItemName() == null ? "" : shopItem.getItemName())
				.itemPrice(NumberFormat.getInstance().format(shopItem.getItemPrice()))
				.itemMainPicUrl(shopItem.getItemMainPicUrl() == null ? "" : shopItem.getItemMainPicUrl())
				.itemDescr(shopItem.getItemDescr() == null ? "" : shopItem.getItemDescr())
				.itemDispDetail(shopItem.getItemDispDetail() == null ? "" : shopItem.getItemDispDetail())
				.build());
				
			}
		}
		return result;
	}
	
}
