package com.devd.microservices.springmicroservicessecureui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
public class SpringMicroservicesSecureuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesSecureuiApplication.class, args);
	}
}
