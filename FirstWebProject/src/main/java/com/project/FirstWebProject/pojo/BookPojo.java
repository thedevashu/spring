package com.project.FirstWebProject.pojo;

public class BookPojo {
	private int id;
	private String name,author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "BookPojo [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	public BookPojo(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	
}
