package com.pattern.template;

public abstract class Base {
	public final void method(){
		this.method1();
		this.method2();
		this.method3();
	}
	
	public abstract void method1();
	
	public abstract void method2();
	
	public abstract void method3();
}
