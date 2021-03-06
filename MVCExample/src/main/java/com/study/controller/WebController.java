package com.study.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.dao.BookDao;
import com.study.entity.BookEntity;

@Controller
public class WebController {

	@Autowired
	BookDao bk;
	
	@GetMapping("/books")
	public List<BookEntity> allBooks(){
		System.out.println(bk.allBooks());
		return bk.allBooks();
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@PostMapping("/delete")
	public String deletebook(@RequestParam String bname,Model model) {
		System.out.println("\n\n\n\n.........reached here...........\n\n\n\n");
		bk.deleteBook(bname);
		return "login";
	}
	
	
	@PostMapping("/verify")
	public String verifyUser(Model model,@RequestParam String uname,@RequestParam String pass)
	{
		System.out.println("reached to verify"+uname+pass);
		model.addAttribute("user", uname);
		List<String> l=bk.getBookId();
		model.addAttribute("bookid",l);
		System.out.println(l);
		return "home";
	}
	@PostMapping("/showbook")
	public String showBook(Model model,@RequestParam String bname) {
		System.out.println("bname++");
		List<String> l=bk.getBookId();
		model.addAttribute("books",l);
		System.out.println(bname);
		model.addAttribute("bookid", bname);
		model.addAttribute("book", bk.getBook(bname));
		return "book";
	}
	
	
	
}
