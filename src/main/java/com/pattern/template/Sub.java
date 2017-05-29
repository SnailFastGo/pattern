package com.pattern.template;

public class Sub extends Base{

	@Override
	public void method1() {
		System.out.println("I am method 1");
	}

	@Override
	public void method2() {
		System.out.println("I am method 2");
	}

	@Override
	public void method3() {
		System.out.println("I am method 3");
	}
	
	public static void main(String[] args) {
		Sub s = new Sub();
		s.method();
	}
	
}
