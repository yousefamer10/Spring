package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class sport implements SportInterface {
@Override
public void mysport() {
	
	System.out.println("i am football");
}
}
