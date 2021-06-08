package com.odiy.webserv.controllers.regist;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PasswordValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return MemgerRegistForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		MemgerRegistForm form = (MemgerRegistForm) target;
		if (form.getMemberPassword() == null || !form.getMemberPassword().equals(form.getMemberPasswordcf())) {
			errors.rejectValue("memberPasswordcf", "test.password", "同じパスワードを入力してください。");
		}
	}

}
