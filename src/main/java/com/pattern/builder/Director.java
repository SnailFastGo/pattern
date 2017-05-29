package com.pattern.builder;

public class Director {
	private Builder builder;
	
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public Product construct(){
		Product product = new Product();
		builder.buildPartA(product);
		builder.buildPartB(product);
		builder.buildPartC(product);
		System.out.println("产品创建完毕");
		return product;
	}
}
