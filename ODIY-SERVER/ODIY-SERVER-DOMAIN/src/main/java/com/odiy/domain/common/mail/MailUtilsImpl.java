package com.odiy.domain.common.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.odiy.domain.common.beans.MailCodeCf;

@Service
public class MailUtilsImpl implements MailUtils {

	@Override
	public void sendEmailCodeCFEmail(MailCodeCf mailCodeCf) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(mailCodeCf.getSendFrom());
		message.setTo(mailCodeCf.getMemberEmail());
		message.setSubject("主题：简单邮件");
		message.setText("测试邮件内容:" + mailCodeCf.getCode());

		mailSender.send(message);

	}

	@Autowired
	private JavaMailSender mailSender;
}
