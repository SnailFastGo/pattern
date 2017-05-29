package com.pattern.single;

public class LazySingleton {
	private static LazySingleton instance = null;
	
	private LazySingleton(){
		
	}
	
	public static LazySingleton getInstance(){
		if(null == instance){
			instance = new LazySingleton();
		}
		return null;
	}
}
