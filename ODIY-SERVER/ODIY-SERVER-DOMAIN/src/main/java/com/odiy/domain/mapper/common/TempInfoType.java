package com.odiy.domain.mapper.common;

public enum TempInfoType {
	MailCode("01"), UUID("02");

	private final String value;

	TempInfoType(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public Long getValidSec() {
		if (value.equals(TempInfoType.MailCode.getValue())) {
			return 600L;
		} else if (value.equals(TempInfoType.UUID.getValue())) {
			return 600L;
		}
		return 0L;
	}
	
	public Integer getCanErrTimes() {
		if (value.equals(TempInfoType.MailCode.getValue())) {
			return 10;
		} else if (value.equals(TempInfoType.UUID.getValue())) {
			return null;
		}
		return null;
	}

}
