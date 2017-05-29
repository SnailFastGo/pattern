package com.pattern.deepcopy;

public class Client {
	public static void main(String[] args) {
		Prototype prototype = new Prototype("hello");
		Prototype prototypeNew = prototype.clone();
		System.out.println(prototypeNew.getAttr());
		System.out.println(prototypeNew.getAttr() == prototype.getAttr());
	}
}
