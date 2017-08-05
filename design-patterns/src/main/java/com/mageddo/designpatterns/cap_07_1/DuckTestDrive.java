package com.mageddo.designpatterns.cap_07_1;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turDuck = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\n The Duck says...");
		testDuck(duck);
		
		System.out.println("\n The TurkeyAdapter says...");
		testDuck(turDuck);
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
}
