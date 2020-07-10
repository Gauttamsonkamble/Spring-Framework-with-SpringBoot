package com.Gauttam.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Gauttam.demo.model.User;






@Controller
public class MyController
{
	@RequestMapping("/home")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(@RequestParam("num1") int i,@RequestParam("num2") int j,ModelMap m)
	{
		
		
		int num3 = i + j;
		
		m.addAttribute("num3",num3);
		
		return "result";
	}
	
	@RequestMapping("/addUser")
	public String addUser(User u)
	{
		
		return "result";
	}
	
	
	
	

}
