package com.project.FirstWebProject.pojo;

public class ProductPojo {

	private String name,desc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "ProductPojo [name=" + name + ", desc=" + desc + "]";
	}

	public ProductPojo(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	public ProductPojo() {
		// TODO Auto-generated constructor stub
	}
	
	
}
