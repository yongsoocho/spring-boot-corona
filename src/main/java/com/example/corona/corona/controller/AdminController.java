package com.example.corona.corona.controller;

import com.example.corona.corona.constant.PlaceType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/admin")
@Controller
public class AdminController {

	@GetMapping("/places")
	public String adminPlaces(@RequestParam(required = false) PlaceType placeType) {
		return "admin/places";
	}

	@GetMapping("/places/{placeId}")
	public String adminPlaceDetail(@PathVariable Integer placeId) {
		return "admin/place-detail";
	}
}
