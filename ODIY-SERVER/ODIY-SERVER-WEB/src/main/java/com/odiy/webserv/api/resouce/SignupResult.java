package com.odiy.webserv.api.resouce;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SignupResult implements Serializable { 
	

	private static final long serialVersionUID = 1L;

	private String statu;
	
	private String code;
	
	List<ErrInfo> errs;
	
	@Data
	@Builder
	public static class ErrInfo{
		public  String errField;
		public  String msg;
		
	}
	

	public SignupResult addErrInfo(final String errField, final String msg) {
		if (errs == null) {
			this.errs = new ArrayList<>();
		}
		
		this.errs.add(ErrInfo.builder().errField(errField).msg(msg).build());
		return this;
	}
}
