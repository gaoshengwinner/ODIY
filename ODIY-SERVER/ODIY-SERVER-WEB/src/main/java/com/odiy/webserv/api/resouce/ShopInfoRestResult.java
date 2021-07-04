package com.odiy.webserv.api.resouce;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ShopInfoRestResult {

	@NotEmpty
	@Size(max = 20)
	private String shopName;

	@NotEmpty
	@Size(max = 50)
	private String shopAddr;

	@NotEmpty
	@Pattern(regexp = "\\A(((0(\\d{1}[-(]?\\d{4}|\\d{2}[-(]?\\d{3}|\\d{3}[-(]?\\d{2}|\\d{4}[-(]?\\d{1}|[5789]0[-(]?\\d{4})[-)]?)|\\d{1,4}\\-?)\\d{4}|0120[-(]?\\d{3}[-)]?\\d{3})\\z", message = "電話番号はただしくありません。")
	private String shopTel;

	@Pattern(regexp = "(http|https):\\/\\/([\\w.]+\\/?)\\S*", message = "URLはただしくありません。")
	private String shopPicUrl;

	private String additionInfo;
	
	private String additionVer;
}
