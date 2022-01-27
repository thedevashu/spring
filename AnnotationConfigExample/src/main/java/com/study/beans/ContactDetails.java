package com.study.beans;

import org.springframework.stereotype.Component;

@Component("contact")
public class ContactDetails {
	private String phone,email;

	public ContactDetails() {
		this.setEmail("Email");
		this.setPhone("99439934");
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
