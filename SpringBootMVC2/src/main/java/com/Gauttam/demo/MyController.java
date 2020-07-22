package com.Gauttam.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Gauttam.demo.model.User;






@Controller
public class MyController
{
	@ModelAttribute
	public void addmodel(Model m)
	{
		m.addAttribute("name", "Gauttam");
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "index";
	}
	

	
	@PostMapping(value="addUser")
	public String addUser(User u)
	{
		
		return "result";
	}
	
	@GetMapping("getUser")
	public String getUser(Model m)
	{
		List<User> user = Arrays.asList(new User(101,"Gauttam"),new User(102,"Robert"));
		
		m.addAttribute("result", user);
		
		return "showUser";
	}
	
	

}
