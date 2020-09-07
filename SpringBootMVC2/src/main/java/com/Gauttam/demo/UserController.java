package com.Gauttam.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Gauttam.demo.dao.UserRepo;
import com.Gauttam.demo.model.User;

@RestController
public class UserController 
{
	@Autowired
	UserRepo repo;
	
	@GetMapping("Users")
	public List<User> getUsers()
	{
		List<User> user = repo.findAll();
			
		System.out.println("getuser method called");
		return user;
	}
	
	@GetMapping("User/{uid}")
	public User user(@PathVariable("uid") int uid) 
	{
		User user = repo.findById(uid).orElse(new User(0,""));
		
		return user;
	}
	
	@PostMapping("User")
	public User addUser(User user)
	{
		repo.save(user);
		
		return user;
	}
	
}
