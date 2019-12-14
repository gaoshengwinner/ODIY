package com.odiy.webserv.controllers.regist;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.odiy.domain.common.beans.MailCodeCf;
import com.odiy.domain.common.mail.MailUtils;
import com.odiy.domain.mapper.common.CommonMapper;
import com.odiy.domain.services.MemberRegistService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MemberRegistController {

	@Inject
	CommonMapper commonMapper;
	@Inject
	MailUtils mailUtils;
	@Inject
	MemberRegistService memberRegistService;

	@Inject
	PasswordValidator passwordValidator;

	@InitBinder("memgerRegistForm")
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(passwordValidator);
	}

	@RequestMapping(path = { "/", "/member/login" }, method = RequestMethod.GET)
	public String getMemberLogin(HttpServletRequest request, HttpServletResponse response) {
		return "member/login";
	}

	@RequestMapping(path = "/member/login", method = RequestMethod.POST)
	public ModelAndView postMemberLogin(ModelAndView mv,
			@ModelAttribute("memgerLoginForm") @Validated MemgerLoginForm form, BindingResult rs) {

		if (rs.hasErrors()) {
			mv.addObject(rs);
			mv.setViewName("member/login");
			return mv;
		}
		mv.setViewName("member/home");
		return mv;
	}

	@RequestMapping(path = "/member/regist", method = RequestMethod.GET)
	public ModelAndView getMemberRegist() {
		ModelAndView mv = new ModelAndView();
		mv.addObject(new MemgerRegistForm());
		mv.setViewName("/member/regist");
		return mv;

	}

	@RequestMapping(path = "/member/regist", method = RequestMethod.POST)
	public ModelAndView postMemberRegist(ModelAndView mv, HttpSession session,
			@ModelAttribute("memgerRegistForm") @Validated MemgerRegistForm form, BindingResult rs) {
		if (rs.hasErrors()) {
			mv.addObject(rs);
			return mv;
		}
		// 既に登録済みかを確認
		if (memberRegistService.checkMemberMailExist(form.getMemberEmail())) {
			FieldError fe = new FieldError(rs.getObjectName(), "memberEmail", null, true,
					new String[] { "test.memberEmail" }, null, "該当メルーアドレスは使用できません。");
			rs.addError(fe);
			mv.addObject(rs);
			return mv;
		}
		try {
			// 確認コード送信
			final MailCodeCf mailCodeCf = MailCodeCf.getInstance(form.getMemberEmail(), form.getMemberPassword());
			session.setAttribute(MailCodeCf.SESSION_KEY, mailCodeCf);
			log.info("確認コード:" + mailCodeCf.getCode());
			mailUtils.sendEmailCodeCFEmail(mailCodeCf);
		} catch (Exception e) {
			log.warn(e.toString());
			mv.setViewName("/member/regist");
			FieldError fe = new FieldError(rs.getObjectName(), "memberEmail", null, true,
					new String[] { "test.memberEmail" }, null, "御入力したメルーアドレスは正しくありません、御確認して入力してください。");
			rs.addError(fe);
			mv.addObject(rs);
			return mv;

		}
		// メルーを送り
		mv.addObject(new MemgerRegistMailCFForm());
		mv.setViewName("/member/regist_mailcf");
		return mv;
	}

	@RequestMapping(path = "/member/regist_mailcf", method = RequestMethod.POST)
	public ModelAndView postMemberRegistCodeCF(ModelAndView mv, HttpSession session,
			@ModelAttribute("memgerRegistMailCFForm") @Validated MemgerRegistMailCFForm memgerRegistMailCFForm,
			BindingResult rs) {

		if (rs.hasErrors()) {
			mv.addObject(rs);
			return mv;
		}

		final MailCodeCf mailCodeCf = (MailCodeCf) session.getAttribute(MailCodeCf.SESSION_KEY);
		if (mailCodeCf != null && mailCodeCf.isOKCode(memgerRegistMailCFForm.getCode())) {
			// goto home
			memberRegistService.resigtMemberByMail(mailCodeCf.getMemberEmail(), mailCodeCf.getPassword());
			mv = new ModelAndView("redirect:/member/login");
		} else if (mailCodeCf != null && mailCodeCf.checkCanRetru()) {
			FieldError fe = new FieldError(rs.getObjectName(), "code", null, true, new String[] { "test.codes" }, null,
					"確認コードは正しくありません。");
			rs.addError(fe);
			mv.addObject(rs);
			return mv;
		}
		
		mv = new ModelAndView("redirect:/member/login");
		return mv;
	}

}