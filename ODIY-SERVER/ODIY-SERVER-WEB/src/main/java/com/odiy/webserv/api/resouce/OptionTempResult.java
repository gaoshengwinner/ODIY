package com.odiy.webserv.api.resouce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OptionTempResult {
	private int id;
	private String desc;
	private Integer orders;
	private Integer defComCount;

	private String propertyString;
}
