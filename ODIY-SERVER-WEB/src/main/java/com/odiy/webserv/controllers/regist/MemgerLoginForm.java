package com.odiy.webserv.controllers.regist;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class MemgerLoginForm {

	@Email(message = "メールアドレスを入力ください。")
	@NotBlank(message = "メールアドレスを入力ください。")
    private String memberEmail;

	@NotBlank(message = "パスワードを入力ください。")
    private String memberPassword;
}
