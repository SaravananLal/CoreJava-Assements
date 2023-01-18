package com.q3.abstrac;

public class WildAnimal extends Animal{

	
	public void kill()
	{
		System.out.println("Wild Animal Kiiling and it is being carivorus");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Wild Animal---------eat");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
		System.out.println("Wild Animal--------sleep");
		
	}
}
