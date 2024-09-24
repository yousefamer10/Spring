package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserInterface user =context.getBean("user",UserInterface.class);
		user.getperson();
		
		context.close();
	}

}
