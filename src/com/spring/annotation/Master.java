package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("master")
public class Master implements MasterInterface1 {
	private SportInterface msport;
	
	
	@Autowired
	public Master(SportInterface msport) {
		this.msport = msport;
	}



	@Override
	public void callsport() {
		msport.mysport();
	}
	@Override
	public void name() {
		System.out.println("i am master");
		
	}
}
