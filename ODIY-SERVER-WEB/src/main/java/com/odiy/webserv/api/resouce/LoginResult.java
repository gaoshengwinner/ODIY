package com.odiy.webserv.api.resouce;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResult implements Serializable { 
	

	private String statu;
	
	List<ErrInfo> errs;
	
	@Data
	@Builder
	public static class ErrInfo{
		public  String errField;
		public  String msg;
		
	}
	
	private static final long serialVersionUID = 1565841911627464411L;

	private String refreshToken;

	//@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    //private Date refreshTokenLimit;
	private long refreshTokenLimit;

    private String accessToken;

    //private Date accessTokenLimit; 
    private long accessTokenLimit; 

	public LoginResult addErrInfo(final String errField, final String msg) {
		if (errs == null) {
			this.errs = new ArrayList<>();
		}
		
		this.errs.add(ErrInfo.builder().errField(errField).msg(msg).build());
		return this;
	}
}
