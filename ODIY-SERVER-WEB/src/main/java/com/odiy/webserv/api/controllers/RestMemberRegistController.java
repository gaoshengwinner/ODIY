package com.odiy.webserv.api.controllers;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.odiy.domain.common.beans.MailCodeCf;
import com.odiy.domain.common.mail.MailUtils;
import com.odiy.domain.services.MemberRegistService;
import com.odiy.webserv.api.resouce.RegistResult;
import com.odiy.webserv.controllers.regist.MemgerRegistForm;
import com.odiy.webserv.controllers.regist.MemgerRegistMailCFForm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class RestMemberRegistController {

	@Inject
	MemberRegistService memberRegistService;

	@Inject
	MailUtils mailUtils;

	@RequestMapping(path = "/v1/api/member/regist")
	public RegistResult postMemberRegist(HttpSession session, @RequestBody @Validated MemgerRegistForm form,
			BindingResult rs, HttpServletResponse response) {
		log.info("start");
		if (rs.hasErrors()) {
			final RegistResult result = RegistResult.builder().statu("-1").build();
			// log.warn(rs.getAllErrors().toString());
			rs.getAllErrors().forEach(ob -> {
				result.addErrInfo(((FieldError) ob).getField(), ob.getDefaultMessage());
			});
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return result;

		}

		// 既に登録済みかを確認
		if (memberRegistService.checkMemberMailExist(form.getMemberEmail().toLowerCase())) {
			return RegistResult.builder().statu("-1").build().addErrInfo("memberEmail", "該当メルーアドレスは使用できません。");
		}

		try {
			// 確認コード送信
			final MailCodeCf mailCodeCf = MailCodeCf.getInstance(form.getMemberEmail(), form.getMemberPassword(), "fbmbservice@yahoo.com");
			session.setAttribute(MailCodeCf.SESSION_KEY, mailCodeCf);
			log.info("確認コード:" + mailCodeCf.getCode());
			mailUtils.sendEmailCodeCFEmail(mailCodeCf);
			return RegistResult.builder().statu("0").build();
		} catch (Exception e) {
			log.warn(e.toString());
			return RegistResult.builder().statu("-1").build().addErrInfo("memberEmail", "御入力したメルーアドレスは正しくありません、御確認して入力してください。");
		}
		//return RegistResult.builder().statu("0").build();
	}
	

	@RequestMapping(path = "/v1/api/member/regist_mailcf", method = RequestMethod.POST)
	public RegistResult postMemberRegistCodeCF(HttpSession session,
			@RequestBody @Validated MemgerRegistMailCFForm memgerRegistMailCFForm,
			BindingResult rs, HttpServletResponse response) {

		if (rs.hasErrors()) {
			final RegistResult result = RegistResult.builder().statu("-1").build();
			// log.warn(rs.getAllErrors().toString());
			rs.getAllErrors().forEach(ob -> {
				result.addErrInfo(((FieldError) ob).getField(), ob.getDefaultMessage());
			});
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return result;
		}

		final MailCodeCf mailCodeCf = (MailCodeCf) session.getAttribute(MailCodeCf.SESSION_KEY);
		
		if (mailCodeCf != null && !mailCodeCf.checkCanRetru()) {
			return RegistResult.builder().statu("-1").build().addErrInfo("code", "確認コードは正しくありません。");
		} else if (mailCodeCf != null && mailCodeCf.isOKCode(memgerRegistMailCFForm.getCode())) {
			// goto home
			memberRegistService.resigtMemberByMail(mailCodeCf.getMemberEmail(), mailCodeCf.getPassword());
			return RegistResult.builder().statu("0").build();
		} else {
			return RegistResult.builder().statu("-1").build().addErrInfo("code", "確認コードは正しくありません。");
		}
	}

}
