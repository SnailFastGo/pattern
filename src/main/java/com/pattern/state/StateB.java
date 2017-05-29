package com.pattern.state;

public class StateB implements State{

	@Override
	public void hand(String param) {
		System.out.println("StateB: " + param);
		
	}
	
}
