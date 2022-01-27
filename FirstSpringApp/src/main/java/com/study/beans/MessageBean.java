package com.study.beans;

public class MessageBean {
	private String message,sender;
	private ContactDetails contactDetails;
	
	public MessageBean() {
		System.out.println("messagebean cons()");
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getSender() {
		return sender;
	}
	
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
}
