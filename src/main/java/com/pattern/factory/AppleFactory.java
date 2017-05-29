package com.pattern.factory;

public class AppleFactory implements Factory{

	@Override
	public Fruit create() {
		Apple apple = new Apple();
		System.out.println("苹果工厂生产了一个苹果");
		return apple;
	}

}
