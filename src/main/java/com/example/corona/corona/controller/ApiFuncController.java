//package com.example.corona.corona.controller;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.function.RouterFunction;
//import org.springframework.web.servlet.function.ServerResponse;
//
//import java.util.List;
//
//import static org.springframework.web.servlet.function.RouterFunctions.route;
//
//@Configuration
//public class ApiFuncController {
//
//	@Bean
//	public RouterFunction<ServerResponse> customRouter() {
//		return route()
//				.GET("/api/places", req -> ServerResponse.ok().body(List.of("hi1", "hi2")))
//				.POST("/api/places", req -> ServerResponse.ok().body(List.of("hi1", "hi2")))
//				.POST("/api/{placeId}", req -> ServerResponse.ok().body(List.of(req.pathVariable("placeId"))))
//				.build();
//	}
//}
