package com.pattern.proxybyimpl;

public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("我是真正的主题");
	}
	
}
