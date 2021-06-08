package com.odiy.domain.common.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceInfo {
	
	private String deviceId;
	
	private String phoneName;
	
	private String appVersion;
	
	private String systemName;
	
	private String systemVersion;
	
	private String deviceIP;
	
}
