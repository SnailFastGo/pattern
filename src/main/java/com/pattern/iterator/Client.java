package com.pattern.iterator;

public class Client {
	public static void main(String[] args) {
		MyContainer container = new MyContainer(16);
		for(int i = 0; i < 16; i++){
			System.out.println(container.add(new Object()));
		}
		MyIterator myIterator = container.myIterator();
		while(myIterator.hasNext()){
			Object next = myIterator.next();
			System.out.println(next);
		}
		
	}
}
