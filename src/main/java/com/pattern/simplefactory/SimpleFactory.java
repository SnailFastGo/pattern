package com.pattern.simplefactory;

public class SimpleFactory {
	private SimpleFactory(){
		
	}
	
	public static Product getInstance(String type){
		if("one".equals(type)){
			return new ProductOne();
		}
		
		if("two".equals(type)){
			return new ProductTwo();
		}
		return null;
	}
}
