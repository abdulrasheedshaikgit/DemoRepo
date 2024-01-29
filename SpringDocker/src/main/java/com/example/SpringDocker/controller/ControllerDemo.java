package com.example.SpringDocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {
	
	@GetMapping(value="/")
	public String welcome()
	{
		return "Welcome to Spring Demo";
	}

}
