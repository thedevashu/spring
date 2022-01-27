package com.study.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.beans.MessageBean;

public class FirstSpringAppApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
//		MessageBean bean=context.getBean("first",MessageBean.class); 
//		System.out.println(bean.getMessage()+" " +bean.getSender()+" \n");
//		
//		System.out.println(bean.getContactDetails().getEmail()+" "+bean.getContactDetails().getAddress().getCity());
//		System.out.println(bean.getContactDetails().getAddress()+" "+bean.getContactDetails()+" "+bean);
		
		MessageBean bean2 =(MessageBean) context.getBean("singletonEx");
		System.out.println("BEAN2\n\n"+bean2+" -- ");
		System.out.println(" -"+bean2.getMessage());
		
		MessageBean bean =(MessageBean) context.getBean("singletonEx");
		System.out.println("BEAN2\n\n"+bean2+" -- "+bean);
		System.out.println(" -"+bean.getMessage());
	}
}
