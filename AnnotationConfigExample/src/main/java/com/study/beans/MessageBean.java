package com.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("MessageBean")//bean property name
@Scope("prototype")//scope set to prototype ie. object created of this class will not be singleton
public class MessageBean {

	private String message,sender;
	
	@Autowired//spring will give refrence to (contact)(<--name of ContactDetailsb bean)
	private ContactDetails contact;
	
	
	public ContactDetails getContact() {
		return contact;
	}
	public void setContact(ContactDetails contact) {
		this.contact = contact;
	}
	public MessageBean() {
		setMessage("set from MessageConstructor()");
		this.setSender("MessageBean()");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	

}
