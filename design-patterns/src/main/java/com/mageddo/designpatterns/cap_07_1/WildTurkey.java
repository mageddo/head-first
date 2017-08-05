package com.mageddo.designpatterns.cap_07_1;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("globbe globble!!");
		
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
		
	}

}
