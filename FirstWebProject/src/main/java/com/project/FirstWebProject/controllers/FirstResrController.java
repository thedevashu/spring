package com.project.FirstWebProject.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//spring holds and map this class as bean 
public class FirstResrController {
	public FirstResrController() {
		System.out.println("Object of Controller class is created");
	}
	
	@RequestMapping(method = RequestMethod.GET,path="/hi")
	public String greet() {
		return "Hello from rest api";
	}
	@PostMapping("/add/{num1}/{num2}")
	public String add(@PathVariable String num1,@PathVariable String num2) {
		System.out.println(num1+num2);
		return Integer.parseInt(num1)+Integer.parseInt(num2)+"";
	}
}
