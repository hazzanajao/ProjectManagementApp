package com.projectmanagementappwithjwtspringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectManagementAppWithJwtSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementAppWithJwtSpringSecurityApplication.class, args);
		System.out.println("Application Running Successfully on Port 8080");
	}

}
