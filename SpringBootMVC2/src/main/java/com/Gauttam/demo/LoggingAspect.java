package com.Gauttam.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 
{

	 
	private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

	
	
	@Before("execution(public * com.Gauttam.demo.UserController.getUsers())")
	public void logBefore()
	{
	    log.info("getUsers Method called Before ");
		
	}
	
	
	@After("execution(public * com.Gauttam.demo.UserController.getUsers())")
	public void logafter()
	{
	    log.info("getUsers Method called After ");
		
	}
	
}
