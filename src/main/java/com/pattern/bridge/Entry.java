package com.pattern.bridge;

public abstract class Entry {
//	实体类型
	private String type;
	
//	可以操作实体的事件
	private Action action;

	public Entry( String type, Action action) {
		this.type = type;
		this.action = action;
	}

//	改变操作实体的事件
	public void setAction(Action action) {
		this.action = action;
	}


	@Override
	public String toString() {
		return this.type + "型Entry";
	}
	
//	实体可以接受的请求
	public void request(String param){
		System.out.println(type + "型Entry收到" + param + "请求," + action + "正在处理");
		action.action(this);
	}
}
