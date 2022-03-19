package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public String home(Model model) {

		model.addAttribute("users",userService.findAll());
		return "index";
	}
	@RequestMapping("/create")
	public String create(Model model) {
		model.addAttribute("user",new User());
		return "create";
	}
	@PostMapping("/create")
	public String createUser(@ModelAttribute User user) {
		System.out.println("Username is :"+user.getUsername());
		userService.create(user);
	return "redirect:/users";
	}

	
	
}
