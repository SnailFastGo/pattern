package com.pattern.proxybydynamic;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		ClassLoader classLoader = realSubject.getClass().getClassLoader();
		SubjectHandler handler = new SubjectHandler(realSubject);
		
//		通过classloader、interfce、handler来生成指定实例的动态代理
		Subject proxy = (Subject)Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, handler);
		proxy.request();
	}
}
