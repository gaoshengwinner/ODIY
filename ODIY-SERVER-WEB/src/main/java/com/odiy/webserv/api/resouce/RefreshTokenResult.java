package com.odiy.webserv.api.resouce;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RefreshTokenResult {
	
	private String statu;
	
	private String err;
	
    private String accessToken;
 
    private long accessTokenLimit; 

}
