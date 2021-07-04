package com.odiy.webserv.api.resouce;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Builder
public class AdditionalMana {
	List<AdditionalInfo> simpleTexts;
	List<AdditionalInfo> htmlTexts;
	List<AdditionalInfo> pictures;
	List<AdditionalInfo> videos;
	List<AdditionalInfo> webViews;

	@Data
	@Builder
	public static class AdditionalInfo {
		boolean canBeUse;
		int no;
		String value;
		String title;
	}

	public static final int DEFAULT_COUNT = 10;
	public static final int USE_DEFAULT_COUNT = 2;

	public static String getDefaultAdditionMana() {
		List<AdditionalInfo> simpleTexts = new ArrayList<>();
		List<AdditionalInfo> htmlTexts = new ArrayList<>();
		List<AdditionalInfo> pictures = new ArrayList<>();
		List<AdditionalInfo> videos = new ArrayList<>();
		List<AdditionalInfo> webViews = new ArrayList<>();
		for (int i = 0; i < DEFAULT_COUNT; i++) {
			final AdditionalInfo aditionalInfo = AdditionalInfo.builder().canBeUse(i < USE_DEFAULT_COUNT ? true : false)
					.no(i + 1).value("").title("").build();
			simpleTexts.add(aditionalInfo);
			htmlTexts.add(aditionalInfo);
			pictures.add(aditionalInfo);
			videos.add(aditionalInfo);
			webViews.add(aditionalInfo);
		}
		final AdditionalMana additionalMana = AdditionalMana.builder().simpleTexts(simpleTexts).htmlTexts(htmlTexts)
				.pictures(pictures).videos(videos).webViews(webViews).build();
		final JsonMapper mapper = new JsonMapper();
		try {
			return mapper.writeValueAsString(additionalMana);
		} catch (JsonProcessingException e) {
			log.warn(e.getMessage());
		}

		return "";
	}
}
