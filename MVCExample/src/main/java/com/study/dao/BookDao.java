package com.study.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.entity.BookEntity;
import com.study.myinterface.MyJPAInterface;

@Service
public class BookDao {
	
	@Autowired
	MyJPAInterface repo;
	public BookEntity getBook(String bname){
		List<BookEntity> bk = repo.findByBname(bname);
		return bk.get(0);
	}
	
	public List<BookEntity> allBooks(){
		List<BookEntity> l=repo.findAll();
		return l;
	}
	
	public void deleteBook(String bname) {
		List<BookEntity> b = repo.findByBname(bname);
		repo.delete(b.get(0));
		System.out.println(bname+"deleted");
	}
	
	public List<String> getBookId(){
		List<BookEntity> l =repo.findAll();
		List<String> idList= new ArrayList<String>();
		for(BookEntity b:l) {
			
			idList.add(b.getBname());
		}
		return idList;
	}
	
}
