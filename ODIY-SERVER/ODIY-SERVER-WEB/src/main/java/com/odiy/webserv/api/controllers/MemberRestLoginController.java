package com.odiy.webserv.api.controllers;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odiy.domain.common.beans.DeviceInfo;
import com.odiy.domain.common.beans.MailCodeCf;
import com.odiy.domain.common.exceptions.AuthotionException;
import com.odiy.domain.common.exceptions.UserNotExsitException;
import com.odiy.domain.common.mail.MailUtils;
import com.odiy.domain.mapper.common.TempInfoType;
import com.odiy.domain.mapper.j99.model.UserToken;
import com.odiy.domain.services.CommonService;
import com.odiy.domain.services.MemberRegistService;
import com.odiy.domain.services.MemberRegistServiceImpl;
import com.odiy.webserv.api.resouce.LoginResult;
import com.odiy.webserv.api.resouce.SignupResult;
import com.odiy.webserv.controllers.regist.MemgerLoginForm;
import com.odiy.webserv.controllers.regist.SignupCnfForm;
import com.odiy.webserv.controllers.regist.SignupCodeCnfForm;
import com.odiy.webserv.controllers.regist.SignupForm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MemberRestLoginController {

	@Inject
	MemberRegistService memberRegistService;

	@Inject
	CommonService commonService;

	@Inject
	MailUtils mailUtils;

	@RequestMapping(path = "/v1/api/member/login")
	public LoginResult login(@RequestBody @Validated MemgerLoginForm form, DeviceInfo di, BindingResult rs,
			HttpServletResponse response) {
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
				.accessTokenLimit(MemberRegistServiceImpl.ACCCESSTOKENLIMIT).refreshToken(ut.getRefreshToken())
				.refreshTokenLimit(MemberRegistServiceImpl.REFRESHTOKENLIMIT).build();

	}

	@RequestMapping(path = "/v1/api/sigup/sigupMailCnf")
	public SignupResult signupMailCnf(@RequestBody @Validated SignupCnfForm form, BindingResult rs,
			HttpServletResponse response, HttpSession session) {
		log.info("start");
		if (rs.hasErrors()) {
			final SignupResult r = SignupResult.builder().statu("-1").build();
			// log.warn(rs.getAllErrors().toString());
			rs.getAllErrors().forEach(ob -> {
				r.addErrInfo(((FieldError) ob).getField(), ob.getDefaultMessage());
			});
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return r;

		}

		final boolean result = memberRegistService.checkMemberMailExist(form.getMemberEmail());
		if (result) {
			return SignupResult.builder().statu("-1").build().addErrInfo("memberEmail", "使用できないメールです。");
		}

		try {
			// 確認コード送信
			final MailCodeCf mailCodeCf = MailCodeCf.getInstance(form.getMemberEmail(), null, "fbmbservice@yahoo.com");
			session.setAttribute(MailCodeCf.SESSION_KEY_SIGUP_MAIL_CODE_KEY, mailCodeCf.getCode());
			session.setAttribute(MailCodeCf.SESSION_KEY_SIGUP_MAIL, form.getMemberEmail());
			log.info("確認コード:" + mailCodeCf.getCode());
			final String uuid = UUID.randomUUID().toString();
			commonService.saveTempInfo(TempInfoType.MailCode, uuid, mailCodeCf.getCode());
			mailUtils.sendEmailCodeCFEmail(mailCodeCf);
			return SignupResult.builder().statu("0").uuid(uuid).build();
		} catch (Exception e) {
			log.warn(e.toString());
			return SignupResult.builder().statu("-1").build().addErrInfo("memberEmail",
					"システムエラー発生しました、しばらく後に再確認してください。");
		}
	}

	@RequestMapping(path = "/v1/api/sigup/sigupCodeCnf")
	public SignupResult signupCodeCnf(@RequestBody @Validated SignupCodeCnfForm form, BindingResult rs,
			HttpServletResponse response, HttpSession session) {
		log.info("start");
		if (rs.hasErrors()) {
			final SignupResult r = SignupResult.builder().statu("-1").build();
			rs.getAllErrors().forEach(ob -> {
				r.addErrInfo(((FieldError) ob).getField(), ob.getDefaultMessage());
			});
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return r;

		}

		final boolean result = commonService.checkTempInfoValue(TempInfoType.MailCode, form.getUuid(), form.getCode());

		if (result) {
			final String uuid = UUID.randomUUID().toString();
			commonService.saveTempInfo(TempInfoType.UUID, uuid, "");
			return SignupResult.builder().statu("0").uuid(uuid).build();
		}

		return SignupResult.builder().statu("-1").build().addErrInfo("code", result ? "" : "コードは正しくありません。");
	}

	@RequestMapping(path = "/v1/api/sigup/sigup")
	public SignupResult signup(@RequestBody @Validated SignupForm form, BindingResult rs, HttpServletResponse response,
			HttpSession session) {
		log.info("start");
		if (rs.hasErrors()) {
			final SignupResult r = SignupResult.builder().statu("-1").build();
			rs.getAllErrors().forEach(ob -> {
				r.addErrInfo(((FieldError) ob).getField(), ob.getDefaultMessage());
			});
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return r;

		}

		final boolean result = commonService.checkTempInfoValue(TempInfoType.MailCode, form.getUuid(), "");

		if (!result) {
			return SignupResult.builder().statu("-1").build().addErrInfo("password", result ? "" : "最初から直してください。");
		}

		memberRegistService.resigtMemberByMail(form.getMemberEmail(), form.getMemberPassword());

		return SignupResult.builder().statu("0").build();
	}

}
