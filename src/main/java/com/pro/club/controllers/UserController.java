package com.pro.club.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController 
{
	@GetMapping("/index")
	public String index()
	{
		return "success";
	}
	
	@GetMapping("/myhome")
	@ResponseBody
	public String myhome()
	{
		return "success";
	}
}
