package com.pattern.classadapter;

public class Client {
	public static void main(String[] args) {
		Target target = new Adatpter();
		int get110v = target.get110v();
		int get220v = target.get220v();
		System.out.println(get110v);
		System.out.println(get220v);
	}
}
