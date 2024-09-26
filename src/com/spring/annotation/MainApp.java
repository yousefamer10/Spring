package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		MasterInterface1 mastername =context.getBean("master",MasterInterface1.class);
		
		mastername.callsport();
		context.close();
	}

}
