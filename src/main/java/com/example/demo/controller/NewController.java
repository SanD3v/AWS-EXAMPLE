package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
	@GetMapping(value = "/api")
	public String name() {
		return "Hello from AWS EC2 instance";

	}

}
