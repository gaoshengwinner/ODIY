package com.odiy.webserv.api.resouce;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegistResult implements Serializable {

	private static final long serialVersionUID = -1449133542352043511L;
	
	public static String errField = "errField";
	public static String msg = "msg";
	
	public String statu;
	
	List<ErrInfo> errs;
	
	public RegistResult addErrInfo(final String errField, final String msg) {
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
