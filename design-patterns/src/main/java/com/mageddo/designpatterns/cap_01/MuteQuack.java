package com.mageddo.designpatterns.cap_01;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack mudo");
		
	}

}
