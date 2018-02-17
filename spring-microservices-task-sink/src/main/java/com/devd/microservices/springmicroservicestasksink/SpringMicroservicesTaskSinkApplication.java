package com.devd.microservices.springmicroservicestasksink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class SpringMicroservicesTaskSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesTaskSinkApplication.class, args);
	}


}
