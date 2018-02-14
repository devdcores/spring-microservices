package com.devd.microservices.springmicroservicesconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringMicroservicesConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesConfigserverApplication.class, args);
	}
}
