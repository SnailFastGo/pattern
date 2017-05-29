package com.pattern.proxybyimpl;

public class Proxy implements Subject{
	
	private Subject subject;

	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		this.before();
		
		subject.request();
		
		this.after();
	}
	
	public void before(){
		
	}
	
	public void after(){
		
	}
	
}
