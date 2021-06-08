package com.odiy.webserv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.odiy.domain.mapper")
@ComponentScan(basePackages={"com.odiy.domain","com.odiy.webserv"})
public class OdiyServerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(OdiyServerWebApplication.class, args);
	}

}
