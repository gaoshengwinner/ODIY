package com.odiy.webserv.handlerInterceptors;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import com.odiy.domain.services.MemberRegistService;
import com.odiy.webserv.api.controllers.ManagRestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RestAuthonInterceptor implements HandlerInterceptor {

	@Inject
	MemberRegistService memberRegistService;
	
	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o)
			throws Exception {
		final String  accessToken = httpServletRequest.getHeader(ManagRestController.AUTHON_ACCESS_HEADER);
		if (StringUtils.isEmpty(accessToken) || !memberRegistService.checkAccessToken(accessToken)) {
			log.warn("アクセストークン不正");
			httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return false;
		}
		return true;
	}
}
