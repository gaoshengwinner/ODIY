package com.odiy.webserv.controllers.maneg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberMamgegController {

	@RequestMapping(path = { "/member/home" }, method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView getMemberHome() {
		ModelAndView mv = new ModelAndView("/member/home");
		return mv;
	}

}
