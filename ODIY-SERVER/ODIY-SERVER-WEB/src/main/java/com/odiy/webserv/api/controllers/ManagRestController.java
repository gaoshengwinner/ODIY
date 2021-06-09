package com.odiy.webserv.api.controllers;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odiy.domain.common.beans.UserInfo;
import com.odiy.domain.common.exceptions.AuthotionException;
import com.odiy.domain.mapper.j99.model.ManaColor;
import com.odiy.domain.mapper.j99.model.OptionTemp;
import com.odiy.domain.mapper.j99.model.ShopBaseInfo;
import com.odiy.domain.mapper.j99.model.ShopItem;
import com.odiy.domain.mapper.j99.model.Tag;
import com.odiy.domain.mapper.j99.model.UserToken;
import com.odiy.domain.services.MemberRegistService;
import com.odiy.domain.services.MemberRegistServiceImpl;
import com.odiy.domain.services.MemberShopService;
import com.odiy.webserv.api.resouce.ApiResult;
import com.odiy.webserv.api.resouce.ApiResultCommon;
import com.odiy.webserv.api.resouce.ManaColorResult;
import com.odiy.webserv.api.resouce.OptionTempResult;
import com.odiy.webserv.api.resouce.OptionTempResultList;
import com.odiy.webserv.api.resouce.RefreshTokenResult;
import com.odiy.webserv.api.resouce.ShopInfoRestResult;
import com.odiy.webserv.api.resouce.ShopItemResult;
import com.odiy.webserv.api.resouce.TagResult;
import com.odiy.webserv.api.resouce.TagResultList;

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
	public RefreshTokenResult refreshToken(HttpServletResponse response,
			@RequestHeader(AUTHON_REFRESH_HEADER) String refreshToken) {
		log.info("/v1/api/manag/refreshToken start");

		try {
			UserToken ut = memberRegistService.refreshToken(refreshToken);
			return RefreshTokenResult.builder().statu("0").accessToken(ut.getAccessToken())
					.accessTokenLimit(MemberRegistServiceImpl.ACCCESSTOKENLIMIT).build();
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
					.shopAddr(shopBaseInfo.getShopAddr()).shopTel(shopBaseInfo.getShopTel())
					.shopPicUrl(shopBaseInfo.getShopPicUrl()).build();
		}
		return ShopInfoRestResult.builder().build();
	}

	@RequestMapping(path = "/v1/api/manag/save_shopInfo")
	public ApiResult saveShopeInfo(@RequestBody @Validated ShopInfoRestResult shopInfo, BindingResult rs,
			UserInfo userInfo, HttpServletResponse response) {

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
				ShopBaseInfo.builder().shopName(shopInfo.getShopName()).shopAddr(shopInfo.getShopAddr())
						.shopTel(shopInfo.getShopTel()).shopPicUrl(shopInfo.getShopPicUrl()).build());

		return ApiResult.builder().build();
	}

	@RequestMapping(path = "/v1/api/manag/shopItemInfo")
	public List<ShopItemResult> getShopItems(UserInfo userInfo) {
		List<ShopItem> list = memberShopService.selectShopItem(userInfo.getMemberID());
		List<ShopItemResult> result = new ArrayList<ShopItemResult>();
		if (list != null) {
			for (ShopItem shopItem : list) {
				result.add(ShopItemResult.builder().id(shopItem.getId())
						.itemName(shopItem.getItemName() == null ? "" : shopItem.getItemName())
						.itemPrice(NumberFormat.getInstance().format(shopItem.getItemPrice()))
						.itemMainPicUrl(shopItem.getItemMainPicUrl() == null ? "" : shopItem.getItemMainPicUrl())
						.itemDescr(shopItem.getItemDescr() == null ? "" : shopItem.getItemDescr())
						.itemDispDetail(shopItem.getItemDispDetail()).shopId(shopItem.getShopId()).build());

			}
		}
		return result;
	}

	@RequestMapping(path = "/v1/api/manag/shopItemInfoRow")
	public List<ShopItemResult> saveShopItem(UserInfo userInfo, @RequestBody ShopItemResult shopItemResult) {
		ShopItem shopItem = ShopItem.builder().id(shopItemResult.getId()).itemName(shopItemResult.getItemName())
				.itemDescr(shopItemResult.getItemDescr())
				.itemPrice(Integer.valueOf(shopItemResult.getItemPrice().replace(",", "")))
				.itemMainPicUrl(shopItemResult.getItemMainPicUrl()).itemDispDetail(shopItemResult.getItemDispDetail())
				.build();

		List<ShopItem> record = memberShopService.savaShopItem(userInfo.getMemberID(), shopItem);

		List<ShopItemResult> result = new ArrayList<ShopItemResult>();
		if (record != null) {
			for (ShopItem si : record) {
				result.add(ShopItemResult.builder().id(si.getId())
						.itemName(si.getItemName() == null ? "" : si.getItemName())
						.itemPrice(NumberFormat.getInstance().format(si.getItemPrice()))
						.itemMainPicUrl(si.getItemMainPicUrl() == null ? "" : si.getItemMainPicUrl())
						.itemDescr(si.getItemDescr() == null ? "" : si.getItemDescr())
						.itemDispDetail(si.getItemDispDetail() == null ? "" : si.getItemDispDetail())
						.shopId(si.getShopId()).build());

			}
		}
		return result;

	}

	@RequestMapping(path = "/v1/api/manag/deleteShopItemRow")
	public void deleteShopItem(UserInfo userInfo, @RequestBody ShopItemResult shopItemResult) {
		ShopItem shopItem = ShopItem.builder().id(shopItemResult.getId()).itemName(shopItemResult.getItemName())
				.itemDescr(shopItemResult.getItemDescr())
				.itemPrice(Integer.valueOf(shopItemResult.getItemPrice().replace(",", "")))
				.itemMainPicUrl(shopItemResult.getItemMainPicUrl()).itemDispDetail(shopItemResult.getItemDispDetail())
				.shopId(shopItemResult.getShopId()).build();

		memberShopService.deleteShopItem(userInfo.getMemberID(), shopItem);

	}

	@RequestMapping(path = "/v1/api/manag/save_shopItemInfo")
	public List<ShopItemResult> saveShopItems(UserInfo userInfo, @RequestBody List<ShopItemResult> lst) {
		List<ShopItem> record = new ArrayList<ShopItem>();
		log.info(lst.toString());
		for (ShopItemResult shopItemResult : lst) {
			record.add(ShopItem.builder().id(shopItemResult.getId()).itemName(shopItemResult.getItemName())
					.itemDescr(shopItemResult.getItemDescr())
					.itemPrice(Integer.valueOf(shopItemResult.getItemPrice().replace(",", "")))
					.itemMainPicUrl(shopItemResult.getItemMainPicUrl())
					.itemDispDetail(shopItemResult.getItemDispDetail()).shopId(shopItemResult.getShopId()).build());
		}
		record = memberShopService.savaShopItem(userInfo.getMemberID(), record);
		List<ShopItemResult> result = new ArrayList<ShopItemResult>();
		if (record != null) {
			for (ShopItem shopItem : record) {
				result.add(ShopItemResult.builder().id(shopItem.getId())
						.itemName(shopItem.getItemName() == null ? "" : shopItem.getItemName())
						.itemPrice(NumberFormat.getInstance().format(shopItem.getItemPrice()))
						.itemMainPicUrl(shopItem.getItemMainPicUrl() == null ? "" : shopItem.getItemMainPicUrl())
						.itemDescr(shopItem.getItemDescr() == null ? "" : shopItem.getItemDescr())
						.itemDispDetail(shopItem.getItemDispDetail() == null ? "" : shopItem.getItemDispDetail())
						.shopId(shopItem.getShopId()).build());

			}
		}
		return result;
	}

	@RequestMapping(path = "/v1/api/manag/manaColorInfo")
	public ApiResultCommon<ManaColorResult> getManaColorfo(UserInfo userInfo) {

		ApiResultCommon<ManaColorResult> r = new ApiResultCommon<ManaColorResult>();
		List<ManaColor> list = memberShopService.selectManaColor(userInfo.getMemberID());
		if (list != null) {
			for (ManaColor manaColor : list) {
				r.addResult(ManaColorResult.manaColor2ManaColorResult(manaColor));
			}
		}
		return r;
	}

	@RequestMapping(path = "/v1/api/manag/save_manaColorInfo")
	public ApiResultCommon<ManaColorResult> saveManaColorInfo(@RequestBody @Validated ManaColorResult manaColorResult,
			BindingResult rs, UserInfo userInfo, HttpServletResponse response) {

		ApiResultCommon<ManaColorResult> r = new ApiResultCommon<ManaColorResult>();
		if (rs.hasErrors()) {
			rs.getAllErrors().forEach(ob -> {
				r.addErrInfo(((FieldError) ob).getField(), ob.getDefaultMessage());
			});
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return r;

		}

		final ManaColor manaColor = memberShopService.saveManaColor(userInfo.getMemberID(),
				ManaColorResult.manaColorResult2ManaColor(manaColorResult));

		return r.addResult(ManaColorResult.manaColor2ManaColorResult(manaColor));
	}

	@RequestMapping(path = "/v1/api/manag/delete_manaColorInfo")
	public ApiResultCommon<Boolean> deleteManaColorInfo(@RequestBody @Validated ManaColorResult manaColorResult,
			BindingResult rs, UserInfo userInfo, HttpServletResponse response) {

		ApiResultCommon<Boolean> r = new ApiResultCommon<Boolean>();
		if (rs.hasErrors()) {
			rs.getAllErrors().forEach(ob -> {
				r.addErrInfo(((FieldError) ob).getField(), ob.getDefaultMessage());
			});
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return r;

		}

		memberShopService.deleteManaColor(userInfo.getMemberID(),
				ManaColorResult.manaColorResult2ManaColor(manaColorResult));

		return r.addResult(true);
	}

	@RequestMapping(path = "/v1/api/manag/get_tags")
	public List<TagResult> getTags(UserInfo userInfo) {
		List<Tag> tags = memberShopService.getTags(userInfo.getMemberID());

		List<TagResult> result = new ArrayList<>();
		if (tags != null) {
			for (Tag tag : tags) {
				result.add(TagResult.builder().id(tag.getId()).data(tag.getData()).desc(tag.getDescr())
						.propertyString(tag.getProperty()).orders(tag.getOrders()).build());

			}
		} else {
			return new ArrayList<TagResult>();
		}
		return result;
	}
	
	
	@RequestMapping(path = "/v1/api/manag/save_tags")
	public List<TagResult> saveTags(UserInfo userInfo, @RequestBody TagResultList  tagRs) {
		
		List<Tag> tags = new ArrayList<Tag>();
		if (tagRs != null && tagRs.getTagLst() != null)
		for (TagResult tgr : tagRs.getTagLst()) {
			tags.add(Tag.builder()
					.id(tgr.getId())
					.descr(tgr.getDesc())
					.data(tgr.getData())
					.property(tgr.getPropertyString()).build());
			

		}
		memberShopService.setTags(userInfo.getMemberID(), tags);
		
		tags = memberShopService.getTags(userInfo.getMemberID());


		List<TagResult> result = new ArrayList<>();
		if (tags != null) {
			for (Tag tag : tags) {
				result.add(TagResult.builder().id(tag.getId()).data(tag.getData()).desc(tag.getDescr())
						.propertyString(tag.getProperty()).build());

			}
		} else {
			return new ArrayList<TagResult>();
		}
		return result;
	}
	

	@RequestMapping(path = "/v1/api/manag/get_optiontemps")
	public List<OptionTempResult> getOptionTemps(UserInfo userInfo) {
		List<OptionTemp> optionTemps = memberShopService.getOptinTemps(userInfo.getMemberID());

		List<OptionTempResult> result = new ArrayList<>();
		if (optionTemps != null) {
			for (OptionTemp optionTemp : optionTemps) {
				result.add(OptionTempResult.builder()
						.id(optionTemp.getId())
						.desc(optionTemp.getDescr())
						.propertyString(optionTemp.getProperty())
						.orders(optionTemp.getOrders())
						.defComCount(optionTemp.getDefComCount()).build());

			}
		} else {
			return new ArrayList<OptionTempResult>();
		}
		return result;
	}
	
	
	@RequestMapping(path = "/v1/api/manag/save_optiontemps")
	public List<OptionTempResult> saveOptionTemps(UserInfo userInfo, @RequestBody OptionTempResultList  optionTempRs) {
		
		List<OptionTemp> optionTemps = new ArrayList<>();
		if (optionTempRs != null && optionTempRs.getOptionTempLst() != null)
		for (OptionTempResult otgr : optionTempRs.getOptionTempLst()) {
			optionTemps.add(OptionTemp.builder().descr(otgr.getDesc()).property(otgr.getPropertyString()).build());
			

		}
		memberShopService.setOptinTemps(userInfo.getMemberID(), optionTemps);
		
		optionTemps = memberShopService.getOptinTemps(userInfo.getMemberID());

		List<OptionTempResult> result = new ArrayList<>();
		if (optionTemps != null) {
			for (OptionTemp optionTemp : optionTemps) {
				result.add(OptionTempResult.builder()
						.id(optionTemp.getId())
						.desc(optionTemp.getDescr())
						.propertyString(optionTemp.getProperty())
						.orders(optionTemp.getOrders())
						.defComCount(optionTemp.getDefComCount()).build());

			}
		} else {
			return new ArrayList<OptionTempResult>();
		}
		return result;
	}
	

}
