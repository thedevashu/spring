package com.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.bean.AddressBean;
import com.study.bean.MessageBean;

public class JavaConfigExampleApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(com.study.config.MyJavaConfiguration.class);
		MessageBean obj = (MessageBean) context.getBean("MessageBean");
		
		System.out.println("\n"+
				obj+"\n");
		
		System.out.println(obj.getMessage()+" <><><>"+obj.getSender());
		
		System.out.println(obj.getContactDetails().getPhone()+" -- "+obj.getContactDetails().getEmail());
		
		
		AddressBean addobj = (AddressBean)context.getBean("AddressBean");
		System.out.println(addobj.getArea()+" addobj");
	}

}
