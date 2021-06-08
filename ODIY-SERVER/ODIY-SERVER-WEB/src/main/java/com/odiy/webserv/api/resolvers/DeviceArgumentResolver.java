package com.odiy.webserv.api.resolvers;

import java.util.Base64;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.odiy.domain.common.beans.DeviceInfo;

@Service
public class DeviceArgumentResolver implements HandlerMethodArgumentResolver {
	public static String DEVICE_INFOR_HEADER = "MB_DEVICE_INFOR_HEADER";

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		Class<?> clazz = parameter.getParameterType();
        return clazz== DeviceInfo.class;
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		final String deviceInfo = webRequest.getHeader(DEVICE_INFOR_HEADER);
		if (StringUtils.isEmpty(deviceInfo)) {
			return null;
		}
		final String decodeDeviceInfo = new String(Base64.getDecoder().decode(deviceInfo));
		ObjectMapper om = new ObjectMapper();
		
		final DeviceInfo di = om.readValue(decodeDeviceInfo, DeviceInfo.class);
		
		return di;
	}

}
