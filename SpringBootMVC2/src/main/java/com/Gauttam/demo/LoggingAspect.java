package com.Gauttam.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 
{
	@Before("execution(public * com.Gauttam.demo.UserController.getUsers())")
	public void log()
	{
		System.out.println("getUsers Method called");
	}
}
