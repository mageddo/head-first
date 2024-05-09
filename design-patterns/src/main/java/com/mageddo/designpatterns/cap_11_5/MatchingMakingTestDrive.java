package com.mageddo.designpatterns.cap_11_5;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

public class MatchingMakingTestDrive {
	Hashtable datingDB = new Hashtable();
	
	public MatchingMakingTestDrive() {
		initializeDatabase();
	}
	
	public static void main(String[] args) {
		MatchingMakingTestDrive test = new MatchingMakingTestDrive(); 
		test.drive();
	}
	
	public void drive(){
		PersonBean joe = getPersonFromDatabase("Joe Javabean");
		
		System.out.println("O titular tentando alterar...\n");
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("Boliche, Fazer coisas");
		System.out.println("Interesses alterados pelo p�prio");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Voc� n�o pode votar em si mesmo");
		}
		System.out.println("Sua avalia��o �: " + ownerProxy.getHotOrNotRating());
		
		System.out.println("\n\nOutro cara qualquer tentando alterar...");
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		
		try {
			nonOwnerProxy.setInterests("Boliche passear, Go");
		} catch (Exception e) {
			System.out.println("Voc� n�o pode mudar os interesses dos outros ;)");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Outro votando em alguem");
		System.out.println("O voto �: " + nonOwnerProxy.getHotOrNotRating());
		
	}
	PersonBean getPersonFromDatabase(String name) {
		return (PersonBean)datingDB.get(name);
	}
	
	PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
	}
	
	PersonBean getNonOwnerProxy(PersonBean person) {
		
        return (PersonBean) Proxy.newProxyInstance(
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
	}
	
	void initializeDatabase() {
		PersonBean joe = new PersonBeanImpl();
		joe.setName("Joe Javabean");
		joe.setInterests("cars, computers, music");
		joe.setHotOrNotRating(7);
		datingDB.put(joe.getName(), joe);

		PersonBean kelly = new PersonBeanImpl();
		kelly.setName("Kelly Klosure");
		kelly.setInterests("ebay, movies, music");
		kelly.setHotOrNotRating(6);
		datingDB.put(kelly.getName(), kelly);
	}
	
	
	
}
