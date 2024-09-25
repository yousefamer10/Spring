package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		MasterInterface mastername =context.getBean("master",MasterInterface.class);
		
		mastername.name();
		context.close();
	}

}
