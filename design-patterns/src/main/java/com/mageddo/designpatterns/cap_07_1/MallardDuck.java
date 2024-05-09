package com.mageddo.designpatterns.cap_07_1;

public class MallardDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("quack quack!!");
		
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
		
	}

}
