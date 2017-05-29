package com.pattern.proxybydynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectHandler implements InvocationHandler{
	
	private Object target;

	public SubjectHandler(Object target) {
		this.target = target;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.before();
		
		method.invoke(target, args);
		
		this.after();
		
		return null;
	}
	
	public void before(){
		System.out.println("before........");
	}
	
	public void after(){
		System.out.println("after.........");
	}
	
}
