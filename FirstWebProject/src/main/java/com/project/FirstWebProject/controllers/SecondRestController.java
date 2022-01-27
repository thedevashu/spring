package com.project.FirstWebProject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//SPring bean that holds and maps and manages the REST API 
@RequestMapping(path="/test")
public class SecondRestController {
	public SecondRestController() {
		// TODO Auto-generated constructor stub
		System.out.println("SECONDRESTCONTROLLER CONSTRUctor");
	}
	@RequestMapping(method = RequestMethod.GET,path="/get")
	public String getExample() {
		return "Hello from second rest controller"+RequestMethod.GET;
	}
	@RequestMapping(method=RequestMethod.POST,path="@12post")
	public void postExample() {
		System.out.println("POST CALLED");
	}
}
