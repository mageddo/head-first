package com.mageddo.designpatterns.cap_09_5;

import java.nio.channels.UnsupportedAddressTypeException;


public abstract class MenuComponent {
	public void add(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild (int i){
		throw new UnsupportedOperationException();
	}
	public String getName(){
		throw new UnsupportedOperationException();
	}
	public String getDescription(){
		throw new UnsupportedOperationException();
	}
	public double getPrice(){
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian(){
		throw new UnsupportedOperationException();
	}
	public void print(){
		throw new UnsupportedOperationException();
	}
	
	public java.util.Iterator createIterator() {
		throw new UnsupportedAddressTypeException();

	}
	
}
