package com.mageddo.designpatterns.cap_01;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Sou um pato mas n�o posso voar");
	}

}
