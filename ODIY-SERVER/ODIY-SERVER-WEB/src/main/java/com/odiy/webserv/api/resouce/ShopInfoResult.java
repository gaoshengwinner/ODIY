package com.odiy.webserv.api.resouce;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShopInfoResult {
	private ShopHeadInfo shopHeadInfo;

	private List<ShopBigPageInfo> shopBigPageInfos;

	@Data
	@Builder
	public static class ShopHeadInfo {

		private String imegUrl;

		private String text;

		private String backgroundColor;

		private String textForegroundColor;
	}

	@Data
	@Builder
	public static class ShopBigPageInfo {

		private int id; // 0 start

		private String title;

		private String imageURL; // SFV
		
		private String bottomColor; // List same value set
		
		private List<PageContents> contents;

	}
	
	public static String CONTENT_TYPE_TEXT = "1";
	public static String CONTENT_TYPE_IMG = "2";
	public static String CONTENT_TYPE_YOUTUBE = "3";
	@Data
	@Builder
	public static class PageContents{
		private int id; // 0 start

		private String contentType;
		
		private Map<String, String> contentProperty;
	}

	public static class PCPT { // PageContentPropertyText
		public static String PCPT_TEXT = "text";
		
		/**
		 * ultraLight
		 * thin
		 * light
		 * regular
		 * medium
		 * semibold
		 * bold
		 * heavy
		 * black
		 */
		public static String PCPT_FONT_WEIGHT = "font.weight";

		/**
		 * largeTitle
		 * title
		 * headline
		 * subheadline
		 * body
		 * callout
		 * footnote
		 * caption
		 */
		public static String PCPT_FONT = "font";
		
		public static String PCPT_FOREGROUND_COLOR = "foregroundColor";
		
		public static String PCPT_BACKGROUND_COLOR = "backgroundColor";
		
	
	}
	
	public static class MapHelper{
		public static MapHelper build() {
			return new MapHelper();
		}
		
		private Map<String, String> old = new HashMap<String, String>();
		
		public MapHelper addMap(String key, String value) {
			
			if (old == null) {
				old = new HashMap<String, String>();
			}
			old.put(key, value);
			return this;
		}
		
		public Map<String, String> get(){
			return old;
		}
	}
}
