package com.odiy.webserv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.odiy.webserv.api.resolvers.DeviceArgumentResolver;
import com.odiy.webserv.api.resolvers.UserInfoArgumentResolver;

@Configuration
public class ConfigurerAdapter implements WebMvcConfigurer {

	@Autowired
	private DeviceArgumentResolver deviceArgumentResolver;
	
	@Autowired
	private UserInfoArgumentResolver userInfoArgumentResolver;

	/**
	 * 配置ArgumentResolvers 实现采用业务逻辑，向controllor 方法中注入参数
	 * 
	 * @param argumentResolvers
	 */
	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		argumentResolvers.add(deviceArgumentResolver);
		argumentResolvers.add(userInfoArgumentResolver);
	}
}
