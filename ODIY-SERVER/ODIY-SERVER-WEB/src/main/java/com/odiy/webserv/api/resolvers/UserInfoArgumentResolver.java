package com.odiy.webserv.api.resolvers;

import javax.inject.Inject;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import com.odiy.domain.common.beans.UserInfo;
import com.odiy.domain.mapper.j99.model.UserToken;
import com.odiy.domain.services.MemberRegistService;
import com.odiy.webserv.api.controllers.ManagRestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserInfoArgumentResolver implements HandlerMethodArgumentResolver {

	@Inject
	MemberRegistService memberRegistService;
	
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		Class<?> clazz = parameter.getParameterType();
        return clazz== UserInfo.class;
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		log.info("UserInfoArgumentResolver");
		final String  accessToken = webRequest.getHeader(ManagRestController.AUTHON_ACCESS_HEADER);
		if (!StringUtils.isEmpty(accessToken)) {
			UserToken ut = memberRegistService.getchUserTokenByAccessToken(accessToken);
			return UserInfo.builder().memberID(ut.getMemberId()).build();
		}
		return null;
	}

}
