package com.odiy.webserv.controllers.regist;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class MemgerRegistMailCFForm {

	@NotBlank(message = "確認コードを入力ください。")
    private String code;
}
