package com.project.FirstWebProject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
}
