package com.pattern.factory;

public class GrapeFactory implements Factory{

	@Override
	public Fruit create() {
		Grape grape = new Grape();
		System.out.println("葡萄工厂生产了一个葡萄");
		return grape;
	}
	
}
