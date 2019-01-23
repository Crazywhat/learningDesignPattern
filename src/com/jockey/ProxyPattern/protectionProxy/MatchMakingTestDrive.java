package com.jockey.ProxyPattern.protectionProxy;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}
	
	public void drive() {
		PersonBean joe = getPersonFromDatabase("Joe Javabean");
		
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Interests set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotorNotRating());
		
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("\n\nName is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			System.out.println("Can't set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotorNotRating());
		
	}
	
	//
	private PersonBean getPersonFromDatabase(String name) {
		return new PersonBeanImpl(name,"man","running");
	}
	
	
	PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean)Proxy.newProxyInstance(person.getClass().getClassLoader()
												, person.getClass().getInterfaces()
												, new OwnerInvocationHandler(person));
	}
	
	PersonBean getNonOwnerProxy(PersonBean person) {
		return (PersonBean)Proxy.newProxyInstance(person.getClass().getClassLoader()
												, person.getClass().getInterfaces()
												, new NonOwnerInvocationHandler(person));
	}
}
