package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/msg")
	public String getMsg()
	{
		return "Hello World";
			
	}

}

