package com.odiy.webserv.api.resouce;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResultCommon<T> {

	private String statu;
	
	private List<T> result;

	List<ErrInfo> errs;
	
	public ApiResultCommon() {
		this.errs = new ArrayList<>();
		this.result = new ArrayList<>();
	}
	
	public ApiResultCommon<T>  addResult(T t){
		this.result.add(t);
		return this;
	}


	public ApiResultCommon<T> addErrInfo(final String errField, final String msg) {
		if (errs == null) {
			this.errs = new ArrayList<>();
		}
		
		this.errs.add(ErrInfo.builder().errField(errField).msg(msg).build());
		return this;
	}
	
	@Data
	@Builder
	public static class ErrInfo {
		public String errField;
		public String msg;

	}

}
