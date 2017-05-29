package com.pattern.bridge;

public class ActionA implements Action{

	@Override
	public void action(Entry entry) {
		System.out.println("ActionA处理了" + entry + "的请求");
	}

	@Override
	public String toString() {
		return "ActionA";
	}
	
}
