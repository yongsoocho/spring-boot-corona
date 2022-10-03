package com.example.corona.corona.domain;

import com.example.corona.corona.constant.PlaceType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Place {
	private Long id;
	private PlaceType placeType;
	private String address;
	private String password;
	private String capacity;
	private String memo;

	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
}

