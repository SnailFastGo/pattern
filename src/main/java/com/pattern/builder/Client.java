package com.pattern.builder;

public class Client {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		Product construct = director.construct();
	}
}
