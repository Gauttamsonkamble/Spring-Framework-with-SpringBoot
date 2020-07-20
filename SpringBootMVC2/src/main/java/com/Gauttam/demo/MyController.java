package com.Gauttam.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	
	
	

}
