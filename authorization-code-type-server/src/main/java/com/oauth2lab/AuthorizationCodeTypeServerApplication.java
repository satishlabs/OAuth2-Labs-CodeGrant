package com.oauth2lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.oauth2lab.info","com.oauth2lab.controller"})
public class AuthorizationCodeTypeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationCodeTypeServerApplication.class, args);
	}

}
