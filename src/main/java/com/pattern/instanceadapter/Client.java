package com.pattern.instanceadapter;

public class Client {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		int get110v = target.get110v();
		int get220v = target.get220v();
		System.out.println(get110v);
		System.out.println(get220v);
		
	}
}
