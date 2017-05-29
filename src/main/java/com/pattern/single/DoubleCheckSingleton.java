package com.pattern.single;

public class DoubleCheckSingleton {
	private volatile static DoubleCheckSingleton instance = null;
	
	private DoubleCheckSingleton(){
		
	}
	
	public static DoubleCheckSingleton getInstance(){
		if(null == instance){
			synchronized(DoubleCheckSingleton.class){
				if(null == instance){
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
