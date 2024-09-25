package com.spring.di;

public class User implements UserInterface {
	 private PersonInterface person;
	
	
	@Override
	public void start() {
		System.out.println("i am user");
	}
	public void setPerson(PersonInterface person) {
		this.person=person;
	}
	
	@Override
	public void getperson() {
		this.person.begain();
		
	}
	
	
}
