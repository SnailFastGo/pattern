package com.pattern.builder;

public class ConcreteBuilder implements Builder{

	@Override
	public void buildPartA(Product product) {
		PartA partA = new PartA();
		product.setPartA(partA);
		System.out.println("已经创建好PartA");
	}

	@Override
	public void buildPartB(Product product) {
		PartB partB = new PartB();
		product.setPartB(partB);
		System.out.println("已经创建好PartB");
	}

	@Override
	public void buildPartC(Product product) {
		PartC partC = new PartC();
		product.setPartC(partC);
		System.out.println("已经创建好PartC");
	}
}
