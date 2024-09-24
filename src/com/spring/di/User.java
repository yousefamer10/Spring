package com.spring.di;

public class User implements UserInterface {
	 private Person person1;
	
	public User(Person person){
		this.person1 =person;
	}
	@Override
	public void start() {
		System.out.println("i am user");
	}
	@Override
	public void getperson() {
		this.person1.begain();
	}
}
