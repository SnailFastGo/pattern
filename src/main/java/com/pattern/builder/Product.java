package com.pattern.builder;

public class Product {
	
	private PartA partA;
	
	private PartB partB;
	
	private PartC partC;
	
	public Product(){
		
	}

	public void setPartA(PartA partA) {
		this.partA = partA;
	}

	public void setPartB(PartB partB) {
		this.partB = partB;
	}

	public void setPartC(PartC partC) {
		this.partC = partC;
	}
	
}
