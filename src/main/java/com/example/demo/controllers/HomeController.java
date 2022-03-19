package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/login")
	public String loginForm() {
		return "login";
	}
	@GetMapping("/support/admin")
	public String adminForm() {
		return "admin";
	}
}
