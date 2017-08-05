package com.mageddo.designpatterns.cap_09_1;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{
	List items;
	int position = 0;
	
	public PancakeHouseMenuIterator(List items) {
		this.items =  items;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.size()){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = (MenuItem) items.get(position);
		position++;
		return menuItem;
	}
}
