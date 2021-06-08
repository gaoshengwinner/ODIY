package com.odiy.domain.common.beans;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UUIDUtils {
	public static String DATE_TIME_FORMAT = "yyyyMMddHHmmss";
	public static String UUID_COOKIE_KEY = "SYSUUID";

	private String uuid;

	private String createDataTime;

	public static UUIDUtils createUUIDutitls() {
		return UUIDUtils.builder().uuid(UUID.randomUUID().toString())
				.createDataTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_TIME_FORMAT))).build();

	}

	@JsonIgnore
	public String getUUIDUtilsString() {
		try {

			final String jsonString = (new ObjectMapper()).writeValueAsString(this);
			return Base64.getEncoder().encodeToString(jsonString.getBytes("utf-8"));
		} catch (JsonProcessingException | UnsupportedEncodingException e) {
			// do nothing
			return null;
		}

	}
}
