package com.pattern.cor;

public class HandlerA extends Handler{
	
	public HandlerA(Handler handler){
		super(handler);
	}

	@Override
	public void request(String param) {
		System.out.println("HandlerA接收了请求");
		super.request(param);
		System.out.println("HandlerA返回了响应");
	}
	
}
