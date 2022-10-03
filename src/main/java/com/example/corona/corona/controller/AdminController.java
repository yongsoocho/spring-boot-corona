package com.example.corona.corona.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {

	@GetMapping("/places/{placeId}")
	public String adminPlaceDetail(@PathVariable Integer placeId) {
		return "admin/place-detail";
	}
}
