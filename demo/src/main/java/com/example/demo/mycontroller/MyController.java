package com.example.demo.mycontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping ("/Greetings")
	public String welcome()
	{
		return("Asslamualykum minnu");
	}
}
