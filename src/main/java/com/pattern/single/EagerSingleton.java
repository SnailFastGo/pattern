package com.pattern.single;

public class EagerSingleton {
	private final static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton(){
		
	}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
}
