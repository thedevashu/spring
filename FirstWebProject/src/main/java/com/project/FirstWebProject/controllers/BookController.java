package com.project.FirstWebProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.FirstWebProject.bean.BookDAOBean;
import com.project.FirstWebProject.pojo.BookPojo;

@RestController
@RequestMapping(path="/book")
public class BookController {
	@Autowired
	private BookDAOBean bd;
	
	@PostMapping("/addbook")
	public void addBook(@RequestBody BookPojo bp) {
		bd.addBook(bp);
		System.out.println(bp);
		System.out.println("Query succes");
	}
	@GetMapping("/read")
	public List<BookPojo> readAll()
	{
		return bd.readAll();
	}

}
