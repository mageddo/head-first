package com.mageddo.designpatterns.cap_09_4;

public class WaiTress {
	MenuComponent allMenus;
	
	public WaiTress(MenuComponent allMenus){
		this.allMenus = allMenus;
	}
	
	public void printMenu(){
		allMenus.print();
		
	}
}
