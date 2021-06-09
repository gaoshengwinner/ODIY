package com.odiy.webserv.controllers.regist;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class SignupForm {

	@Email(message = "メールアドレスを入力ください。")
	@NotBlank(message = "メールアドレスを入力ください。")
	private String memberEmail;

	@NotBlank(message = "最初からにしてください。")
	private String uuid;

	@Pattern(regexp = "^.*(?=.{6,})(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$", message = "8桁大文字・小文字を含む半角英数字を入力してください。")
	private String memberPassword;
}
