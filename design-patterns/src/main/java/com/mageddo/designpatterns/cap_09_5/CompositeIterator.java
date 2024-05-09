package com.mageddo.designpatterns.cap_09_5;

import java.util.Stack;
import java.util.Iterator;;

public class CompositeIterator implements java.util.Iterator{

	Stack stack = new Stack();
	
	public CompositeIterator(java.util.Iterator iterator) {
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if(stack.isEmpty()){
			return false;
		}else{
			Iterator iterator = (Iterator) stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				return true;
			}
		}
	}

	@Override
	public Object next() {
		if(hasNext()){
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if(component instanceof Menu){
				stack.push(component.createIterator());
			}
			return component;
		}
		
		return null;
		
		
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
		
	}
	
	
}
