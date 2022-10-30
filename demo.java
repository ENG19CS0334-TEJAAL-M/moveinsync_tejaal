package com.example.proj1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class demo {
	@GetMapping("/hello")
	public String getMessage()
	{
		return"welcome to demo";
	}
	
}
