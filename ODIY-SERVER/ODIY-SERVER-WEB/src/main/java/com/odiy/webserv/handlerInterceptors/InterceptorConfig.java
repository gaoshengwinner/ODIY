package com.odiy.webserv.handlerInterceptors;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

	@Bean
	RestAuthonInterceptor restAuthonInterceptor() {
		return new RestAuthonInterceptor();
	}
	
	LogHandlerInterceptor logHandlerInterceptor() {
		return new LogHandlerInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(logHandlerInterceptor());
		
		registry.addInterceptor(restAuthonInterceptor())
		.addPathPatterns(Arrays.asList("/v1/api/manag/*"))
		.excludePathPatterns("/v1/api/manag/refreshToken");
		

	}
}