package com.odiy.webserv.api.resouce;

import java.util.ArrayList;
import java.util.List;

import com.odiy.webserv.api.resouce.LoginResult.ErrInfo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ApiResult {
	
	private String statu;
	
	List<ErrInfo> errs;
	
	public ApiResult addErrInfo(final String errField, final String msg) {
		if (errs == null) {
			this.errs = new ArrayList<>();
		}
		
		this.errs.add(ErrInfo.builder().errField(errField).msg(msg).build());
		return this;
	}
	
	@Data
	@Builder
	public static class ErrInfo{
		public  String errField;
		public  String msg;
		
	}

}
