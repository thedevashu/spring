package com.project.FirstWebProject.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.FirstWebProject.pojo.ProductPojo;

@RestController
@RequestMapping(path="/json")
public class MediaTypeController {

	@GetMapping("/products")
	public List<ProductPojo> getAll()
	{
		List<ProductPojo> al = new ArrayList<>();
		al.add(new ProductPojo("BLUE labs", "SSD"));
		al.add(new ProductPojo("RED labs", "SSD"));
		al.add(new ProductPojo("YELLO labs", "SSD"));
		al.add(new ProductPojo("PURPLE labs", "SSD"));
		
		return al;
	}
	
	@PostMapping("addall")
	public void pList(@RequestBody List<ProductPojo> l)
	{
		System.out.println(l);
	}
	
	@PostMapping("/add")
	public void addProduct(@RequestBody ProductPojo p)
	{
		System.out.println(p);
	}
	
	@GetMapping("/num")
	public int[][] aray() {
		int a[][] = {{1,2,3},{1,2,3}};
		return a;
	}
	@GetMapping("/mul/{num1}/{num2}")
	public int  mult(@PathVariable int num1,@PathVariable int num2) {
		return num1*num2;
	}
	@GetMapping("/sum")
	public int add(@RequestParam int num1,@RequestParam int num2)
	{
		return  num1+num2;
	}
	
	@GetMapping("/product")
	public ProductPojo getProduct()
	{
		return new ProductPojo("Mousse","jerry");
	}
}
