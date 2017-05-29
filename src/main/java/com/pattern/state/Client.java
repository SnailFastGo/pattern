package com.pattern.state;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		State stateA = new StateA();
		context.setState(stateA);
		context.request("hello");
		
		State stateB = new StateB();
		context.setState(stateB);
		context.request("hello");
	}
}
