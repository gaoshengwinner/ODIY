package com.odiy.domain.common.beans;

import java.util.Random;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MailCodeCf {
	public static String SESSION_KEY_SIGUP_MAIL = "SIGUP_MAIL";
	public static String SESSION_KEY_SIGUP_MAIL_CODE_KEY = "SIGUP_MAIL_CODE_KEY";
	public static int MAX_PREM_COUNT = 5;
	private String memberEmail;
	
	private String sendFrom;

	private String password;

	private String code;

	private int errcount;

	public static MailCodeCf getInstance(String memberEmail, String password, String sendFrom) {
		String code = getRandomString(6);
		return MailCodeCf.builder().code(code).memberEmail(memberEmail).password(password).sendFrom(sendFrom).errcount(0).build();
	}

	public boolean isOKCode(String code) {
		return this.code.equals(code);
	}

	public boolean checkCanRetru() {
		return (this.errcount++) > MAX_PREM_COUNT ? false : true;
	}

	public static String getRandomString(int length) {
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(62);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}
}
