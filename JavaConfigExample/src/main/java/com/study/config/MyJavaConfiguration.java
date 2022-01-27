package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.study.bean.AddressBean;
import com.study.bean.ContactDetails;
import com.study.bean.MessageBean;

@Configuration//this annotation will tell spring that this class is going to be config
public class MyJavaConfiguration {
	@Bean("MessageBean")//this gives id to property
	@Scope("prototype")//will not be singleton object
	
	public MessageBean fun1()//this will set values of the created object 
	{
		MessageBean obj = new MessageBean();
		obj.setMessage("HEllo from func1 where value is setted");
		obj.setSender("fun1 is sending from myjavaconfig");
		obj.setContactDetails(fun2());//injection Contact detail
		return obj;
	}
	
	@Bean("ContactDetails")//setting property name
	public ContactDetails fun2() //setting bean values
	{
		ContactDetails obj = new ContactDetails();
		obj.setEmail("email@email");
		obj.setPhone("99885645");
		obj.setAddress(fun3());//injecting address
		return obj;
	}
	
	@Bean("AddressBean")
	public AddressBean fun3()
	{
		AddressBean obj = new AddressBean();
		obj.setArea("area");
		obj.setCity("city");
		obj.setPin("43332");
		
		return obj;
	}	
}
