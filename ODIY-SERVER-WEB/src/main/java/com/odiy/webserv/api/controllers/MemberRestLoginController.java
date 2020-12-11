package com.odiy.webserv.api.controllers;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odiy.domain.common.beans.DeviceInfo;
import com.odiy.domain.common.exceptions.AuthotionException;
import com.odiy.domain.common.exceptions.UserNotExsitException;
import com.odiy.domain.mapper.j99.model.UserToken;
import com.odiy.domain.services.MemberRegistService;
import com.odiy.domain.services.MemberRegistServiceImpl;
import com.odiy.webserv.api.resouce.LoginResult;
import com.odiy.webserv.controllers.regist.MemgerLoginForm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MemberRestLoginController {

	@Inject
	MemberRegistService memberRegistService;
	
	
	@RequestMapping(path = "/v1/api/member/login")
	public LoginResult login(@RequestBody @Validated MemgerLoginForm form, DeviceInfo di, BindingResult rs,HttpServletResponse response) {
		log.info("start");
		if (rs.hasErrors()) {
			final LoginResult r = LoginResult.builder().statu("-1").build();
			// log.warn(rs.getAllErrors().toString());
			rs.getAllErrors().forEach(ob -> {
				r.addErrInfo(((FieldError) ob).getField(), ob.getDefaultMessage());
			});
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return r;

		}
		UserToken ut;
		try {
			ut = memberRegistService.loginForApi(form.getMemberEmail().toLowerCase(), form.getMemberPassword(), di);
		} catch (UserNotExsitException e) {
			final LoginResult r = LoginResult.builder().statu("-2").build();
			r.addErrInfo("memberEmail", e.getMessage());
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return r;
		} catch (AuthotionException e) {
			final LoginResult r = LoginResult.builder().statu("-3").build();
			r.addErrInfo("memberEmail", e.getMessage());
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return r;
		}
		
		return LoginResult.builder().accessToken(ut.getAccessToken())
				.accessTokenLimit(MemberRegistServiceImpl.ACCCESSTOKENLIMIT)
				.refreshToken(ut.getRefreshToken())
				.refreshTokenLimit(MemberRegistServiceImpl.REFRESHTOKENLIMIT)
				.build()
				;
						
	}
	
}
