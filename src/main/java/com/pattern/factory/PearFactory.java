package com.pattern.factory;

public class PearFactory implements Factory{

	@Override
	public Fruit create() {
		Pear pear = new Pear();
		System.out.println("梨工厂生产了一个梨");
		return pear;
	}
	
}
