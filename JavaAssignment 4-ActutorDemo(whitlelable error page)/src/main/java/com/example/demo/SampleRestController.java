package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	@GetMapping("/greeting")
	public String greeting() {
		return "Welcome to microservices";
	}

	@Value("shweta gund")
	private String name;
	
	@GetMapping("/greeting1")
	public String greeting1() {
		return name + "Welcome to microservices";
	}
}

