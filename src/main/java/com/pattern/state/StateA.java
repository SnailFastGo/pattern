package com.pattern.state;

public class StateA implements State{

	@Override
	public void hand(String param) {
		System.out.println("StateA : " + param);
	}
	
}
