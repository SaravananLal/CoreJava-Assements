package com.q3.abstrac;

public class Bird extends Animal {

	int id;
	String name;
 Bird()
 {
	 this();
 }
 Bird(int id, String name)
 {
	 this.id=id;
	 this.name=name;
	 
 }
 
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Bird is eating-----------");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
		System.out.println("Bird is sleeping----------");
		
	}
	public void fly()
	{
		System.out.println("Bird ---------come under child class Animal");
	}

}
