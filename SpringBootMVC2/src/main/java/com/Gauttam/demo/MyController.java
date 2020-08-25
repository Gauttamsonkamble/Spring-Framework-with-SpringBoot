package com.Gauttam.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Gauttam.demo.dao.UserRepo;
import com.Gauttam.demo.model.User;






@Controller
public class MyController
{
	@Autowired
	UserRepo repo;
	
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
	public String addUser(User u,Model m)
	{
		m.addAttribute(u);
		return "result";
	}
	
	@GetMapping("getUser")
	public String getUser(Model m)
	{
		m.addAttribute("result", repo.findAll());
		
		return "showUser";
	}
}
