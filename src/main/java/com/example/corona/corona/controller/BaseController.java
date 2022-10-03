package com.example.corona.corona.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BaseController implements ErrorController {

	@GetMapping()
	public ModelAndView root() {
		Map<String, Object> map = new HashMap<>();
		map.put("placeType", "haha");
		return new ModelAndView("index", map);
	}

	@RequestMapping("/error-custom")
	public String error123() {
		return "error";
	}
}
