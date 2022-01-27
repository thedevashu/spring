package com.study.entity;

import javax.persistence.*;

@Entity
@Table(name="books")
public class BookEntity {

	@Id
	private int id;
	@Column
	private String bname;
	@Column
	private int bcost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBcost() {
		return bcost;
	}
	public void setBcost(int bcost) {
		this.bcost = bcost;
	}
	public BookEntity(int id, String bname, int bcost) {
		super();
		this.id = id;
		this.bname = bname;
		this.bcost = bcost;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", bname=" + bname + ", bcost=" + bcost + "]";
	}
	
	
	
}
