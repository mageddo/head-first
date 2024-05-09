package com.mageddo.designpatterns.cap_12_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable{

	List quackers = new ArrayList();
	
	public void add(Quackable quacker){
		quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		Iterator iterator = quackers.iterator();
		while(iterator.hasNext()){
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
		}
	}

}
