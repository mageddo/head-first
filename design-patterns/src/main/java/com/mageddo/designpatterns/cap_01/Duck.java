package com.mageddo.designpatterns.cap_01;

public class Duck {

	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;


	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	public void display(){
		System.out.println("Mostrou o pato?");		
	}
}
