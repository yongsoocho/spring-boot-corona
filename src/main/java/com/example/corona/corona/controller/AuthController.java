package com.example.corona.corona.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/auth")
@Controller
public class AuthController {

	@GetMapping("/login")
	public String login() {
		return "auth/login";
	}

	@GetMapping("/sign-up")
	public String signUp() {
		return "auth/sign-up";
	}
}
