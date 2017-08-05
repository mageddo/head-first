package com.mageddo.designpatterns.cap_12_1;

public class GooseAdapter implements Quackable{
	Goose goose;
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
	public void quack() {
		goose.honk();
	};
}
