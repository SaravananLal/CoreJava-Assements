package com.q3.abstrac;

public class Bird extends Animal {

	String state;
	String habit;
	String eating;

 
	public Bird(String state, String habit, String eating) {
		super();
		this.state = state;
		this.habit = habit;
		this.eating = eating;
	}


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Bird is eating-----------"+this.eating);
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
		System.out.println("Bird is sleeping--------"+this.state);
		
	}
	public void fly()
	{
		System.out.println("Bird is flying ---------"+this.habit);
	}

}
