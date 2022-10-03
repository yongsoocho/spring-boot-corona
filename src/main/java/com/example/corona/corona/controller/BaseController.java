package com.example.corona.corona.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController implements ErrorController {

	@GetMapping()
	public String root() {
		return "index";
	}

	@RequestMapping("/error-custom")
	public String error123() {
		return "error";
	}
}