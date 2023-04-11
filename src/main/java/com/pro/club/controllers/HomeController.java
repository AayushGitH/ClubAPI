package com.pro.club.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pro.club.dao.UserRepositoy;
import com.pro.club.entities.secA.User;


@Controller
public class HomeController 
{
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepositoy userRepositoy;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/sign")
	public String signinHandler()
	{
		return "signin";
	}
	
	@GetMapping("/signin")
	public String loginHandler()
	{
		return "login";
	}
	
	@GetMapping("/success")
	public String singin()
	{
		return "success";
	}
	
	public String signinsubmit()
	{
		return "success";
	}
	
	@PostMapping("/sign_user")
	public String signinuser(@ModelAttribute("user") User user)
	{
		user.setRole("ROLE_USER");
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		this.userRepositoy.save(user);
		return "success";
	}
}
