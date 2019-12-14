package com.odiy.domain.common.beans;

public enum MemberStaus {

	OK("0"), WATCHING("1"), LOCKED("9");

	private String value;

	MemberStaus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
