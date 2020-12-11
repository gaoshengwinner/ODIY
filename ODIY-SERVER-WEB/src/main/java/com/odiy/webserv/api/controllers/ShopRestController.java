package com.odiy.webserv.api.controllers;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odiy.webserv.api.resouce.ShopInfoResult;
import com.odiy.webserv.api.resouce.ShopInfoResult.MapHelper;
import com.odiy.webserv.api.resouce.ShopInfoResult.PCPT;
import com.odiy.webserv.api.resouce.ShopInfoResult.PageContents;
import com.odiy.webserv.api.resouce.ShopInfoResult.ShopBigPageInfo;
import com.odiy.webserv.api.resouce.ShopInfoResult.ShopHeadInfo;
import com.odiy.webserv.cons.ColorList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ShopRestController {

	@RequestMapping(path = "/v1/api/shop/{shopID}")
	public ShopInfoResult getShopInfo(@PathVariable String shopID) {
		log.info("getShopInfo " + shopID);
		if ("1".equalsIgnoreCase(shopID)) {
			int i = 0;
			return ShopInfoResult.builder()
					.shopHeadInfo(ShopHeadInfo.builder().backgroundColor(ColorList.Green).imegUrl("")
							// .imegUrl("https://shinanyaku.com/wp-content/uploads/2018/04/sushiro.png")
							.text("中華料理").textForegroundColor(ColorList.Red).build())
					.shopBigPageInfos(Arrays.asList(

							ShopBigPageInfo.builder().id(i++).title("Home").imageURL("house")
									.bottomColor(ColorList.Yellow).build(),

							ShopBigPageInfo.builder().id(i++).title("Menu").imageURL("list.dash")
									.bottomColor(ColorList.Yellow).build(),

							ShopBigPageInfo.builder().id(i++).title("Order").imageURL("square.and.arrow.up")
									.bottomColor(ColorList.Yellow).build(),

							ShopBigPageInfo.builder().id(i++).title("My").imageURL("person.crop.circle.fill")
									.bottomColor(ColorList.Yellow).build()

					)).build();
		} else if ("2".equalsIgnoreCase(shopID)) {
			int i = 0;
			return ShopInfoResult.builder()
					.shopHeadInfo(ShopHeadInfo.builder().backgroundColor(ColorList.Green).imegUrl("")
							 .imegUrl("https://shinanyaku.com/wp-content/uploads/2018/04/sushiro.png")
							.text("スシロー")
							 .textForegroundColor(ColorList.Yellow)
							.build())
					.shopBigPageInfos(Arrays.asList(
							ShopBigPageInfo.builder().id(i++).title("Home").imageURL("house")
									.bottomColor(ColorList.Yellow)
									.contents(Arrays.asList(PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "東京都ではきのう290人の感染が確認され、3日連続で200人を超えていたが、4日ぶりに200人を下回った。その一方、11日連続で100人を超えた。（ANNニュース）")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "footnote")
													.get()
													)
											.build()))
									.build(),

									ShopBigPageInfo.builder().id(i++).title("Home").imageURL("house")
									.bottomColor(ColorList.Yellow)
									.contents(Arrays.asList(PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "東京都ではきのう290人の感染が確認され、3日連続で200人を超えていたが、4日ぶりに200人を下回った。その一方、11日連続で100人を超えた。（ANNニュース）")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "footnote")
													.get()
													)
											.build()))
									.build(),

									ShopBigPageInfo.builder().id(i++).title("Home").imageURL("house")
									.bottomColor(ColorList.Yellow)
									.contents(Arrays.asList(PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "東京都ではきのう290人の感染が確認され、3日連続で200人を超えていたが、4日ぶりに200人を下回った。その一方、11日連続で100人を超えた。（ANNニュース）")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "footnote")
													.get()
													)
											.build()))
									.build(),

									ShopBigPageInfo.builder().id(i++).title("Home").imageURL("house")
									.bottomColor(ColorList.Yellow)
									.contents(Arrays.asList(PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "関係者によると、東京都できょう新たに確認された新型コロナウイルスへの感染者は188人だった。小池都知事はきょう行われた全国知事会「コロナ対策本部」WEB会議の中で、検査数がおよそ4500件、感染者数が180人台となる見通しなどを明らかにしていた。")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "headline")
													.get()
													)
											.build(),
											PageContents.builder()
											.id(i++)
											.contentType(ShopInfoResult.CONTENT_TYPE_TEXT)
											.contentProperty(MapHelper.build().addMap(PCPT.PCPT_TEXT, "東京都ではきのう290人の感染が確認され、3日連続で200人を超えていたが、4日ぶりに200人を下回った。その一方、11日連続で100人を超えた。（ANNニュース）")
													.addMap(PCPT.PCPT_FONT_WEIGHT, "light")
													.addMap(PCPT.PCPT_FONT, "footnote")
													.get()
													)
											.build()))
									.build()

					)).build();
		} else {
			int i = 0;
			return ShopInfoResult.builder()
					.shopHeadInfo(ShopHeadInfo.builder().backgroundColor(ColorList.Green).imegUrl("")
							// .imegUrl("https://shinanyaku.com/wp-content/uploads/2018/04/sushiro.png")
							.text("中華料理").textForegroundColor(ColorList.Red).build())
					.shopBigPageInfos(Arrays.asList(

							ShopBigPageInfo.builder().id(i++).title("Home").imageURL("house")
									.bottomColor(ColorList.Yellow).build(),

							ShopBigPageInfo.builder().id(i++).title("Menu").imageURL("list.dash")
									.bottomColor(ColorList.Yellow).build(),

							ShopBigPageInfo.builder().id(i++).title("Order").imageURL("square.and.arrow.up")
									.bottomColor(ColorList.Yellow).build(),

							ShopBigPageInfo.builder().id(i++).title("My").imageURL("person.crop.circle.fill")
									.bottomColor(ColorList.Yellow).build()

					)).build();
		}
	}

}
