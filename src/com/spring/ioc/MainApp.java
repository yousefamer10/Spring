package com.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	/*	Sports s1 =new Football();
		s1.sport(); */
		
	ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Sports anySport =context.getBean("MySport",Sports.class);
		anySport.sport();
		context.close();
	}

}
