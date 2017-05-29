package com.pattern.single;

public class InnerClassSingleton {
	private InnerClassSingleton(){
		
	}
	
	private static class InnerClass{
		private final static InnerClassSingleton instance = new InnerClassSingleton();
	}
	
	public static InnerClassSingleton getInstance(){
		return InnerClass.instance;
	}
}
