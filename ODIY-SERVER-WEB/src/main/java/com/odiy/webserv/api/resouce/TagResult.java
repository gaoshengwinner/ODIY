package com.odiy.webserv.api.resouce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
 public class TagResult {
	private int id;
	private String data;
	private String desc;

	private String propertyString;
}