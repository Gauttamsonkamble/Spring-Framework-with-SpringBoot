package com.Gauttam.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Gauttam.demo.dao.UserRepo;
import com.Gauttam.demo.model.User;

@RestController
public class UserController 
{
	@Autowired
	UserRepo repo;
	
	@GetMapping("User")
	public List<User> getUser()
	{
		List<User> user = repo.findAll();
		
		return user;
	}
}
