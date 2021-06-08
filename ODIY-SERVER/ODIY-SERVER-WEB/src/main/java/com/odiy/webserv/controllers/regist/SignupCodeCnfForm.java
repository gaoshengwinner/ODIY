package com.odiy.webserv.controllers.regist;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class SignupCodeCnfForm {

	@NotBlank(message = "コードを入力ください。")
    private String code;
}
