package com.pattern.bridge;

public class ActionC implements Action{

	@Override
	public void action(Entry entry) {
		System.out.println("ActionC处理了" + entry + "的请求");
	}

	@Override
	public String toString() {
		return "ActionC";
	}
	
}
