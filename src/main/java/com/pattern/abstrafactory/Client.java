package com.pattern.abstrafactory;

public class Client {
	public static void main(String[] args) {
//		使用不同的工厂，创建不同的产品族
//		Factory factory = new AmdFactory();
		Factory factory = new IntelFactory();
		factory.createCpu();
		factory.createMainBoard();
	}
}
