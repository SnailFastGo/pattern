package com.pattern.cor;

public class HandlerB extends Handler{
	
	public HandlerB(Handler handler){
		super(handler);
	}

	@Override
	public void request(String param) {
		System.out.println("HandlerB接收了请求");
		super.request(param);
		System.out.println("HandlerB返回了响应");
	}
	
}
