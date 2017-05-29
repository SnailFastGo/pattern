package com.pattern.bridge;

public class ActionB implements Action{

	@Override
	public void action(Entry entry) {
		System.out.println("ActionB处理了" + entry + "的请求");
	}

	@Override
	public String toString() {
		return "ActionB";
	}
	
}
