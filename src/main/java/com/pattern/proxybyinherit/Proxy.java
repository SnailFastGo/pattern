package com.pattern.proxybyinherit;

public class Proxy extends RealSubject{

	@Override
	public void request() {
		this.before();
		
		super.request();
		
		this.after();
	}
	
	public void before(){
		
	}
	
	public void after(){
		
	}
}
