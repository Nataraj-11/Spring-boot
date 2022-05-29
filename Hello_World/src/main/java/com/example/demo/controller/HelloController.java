package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping("/home")
	@ResponseBody
	public String Hello()
	{
		return "Hello this is my first spring boot application";
	}

}
