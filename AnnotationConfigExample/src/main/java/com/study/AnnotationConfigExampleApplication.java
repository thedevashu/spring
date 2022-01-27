package com.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.beans.MessageBean;

public class AnnotationConfigExampleApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.study.beans");
		MessageBean obj =(MessageBean) context.getBean("MessageBean");
		System.out.println("\n\n");
		System.out.println(obj.getMessage()+" "+obj.getSender());
		
		System.out.println(obj.getContact().getEmail()+"--"+obj.getContact().getPhone());
	}

}
