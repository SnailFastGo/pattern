package com.pattern.shallowcopy;

public class Client {
	public static void main(String[] args) {
		Prototype p = new Prototype("hello");
		Prototype pNew = p.clone();
		System.out.println(pNew.getAttr());
		System.out.println(pNew.getAttr() == p.getAttr());
	}
}
