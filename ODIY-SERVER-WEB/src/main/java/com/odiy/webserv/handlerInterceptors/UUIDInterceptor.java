package com.odiy.webserv.handlerInterceptors;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.odiy.domain.common.beans.UUIDUtils;

/**
 * 植入UUIDCookie
 *
 */
public class UUIDInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o)
			throws Exception {
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object o, Exception e) throws Exception {
		Cookie[] cookies = httpServletRequest.getCookies();
		boolean have = false;
		if (cookies != null) {
			for (Cookie ck : cookies) {
				if (UUIDUtils.UUID_COOKIE_KEY.equals(ck.getName())) {
					have = true;
					break;
				}
			}
		}

		if (have) {
			final String s = UUIDUtils.createUUIDutitls().getUUIDUtilsString();
			Cookie cookie = new Cookie(UUIDUtils.UUID_COOKIE_KEY, s);
			cookie.setMaxAge(60 * 60 * 24 * 365 * 10);
			httpServletResponse.addCookie(cookie);
		}
	}
}
