package com.study.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="prod_tbl")
public class ProductEntity  {
	@Id
	@Column
	private int id;
	
	private int cost;
	@Column
	private String name;
	
	@Column(name="info")
	private String info;
	
	@Column(name="exp_date")
	private Date expDate;

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public ProductEntity(int id, int cost, String name, String info,Date expDate) {
		super();
		this.id = id;
		this.cost = cost;
		this.name = name;
		this.info = info;
		this.expDate=expDate;
	}

	public ProductEntity() {
		
		System.out.println("Product Entity:="+count++);
	}
	private static int count=0;

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", cost=" + cost + ", name=" + name + ", info=" + info + "Expire date="+expDate+"]";
	}
	
 
}
