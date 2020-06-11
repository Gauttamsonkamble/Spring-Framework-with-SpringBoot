package com.Gauttam.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		
		User obj = context.getBean(User.class);
		
		obj.name();
	}

}
