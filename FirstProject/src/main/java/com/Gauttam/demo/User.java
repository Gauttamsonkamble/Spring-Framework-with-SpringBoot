package com.Gauttam.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User 
{

	@Autowired
	ComStud stud;
	public void name()
	{
		stud.sub();
	}

}
