package com.pattern.cor;

public class HandlerC extends Handler{
	
	public HandlerC(Handler handler){
		super(handler);
	}

	@Override
	public void request(String param) {
		System.out.println("HandlerC接收了请求");
		super.request(param);
		System.out.println("HandlerC返回了响应");
	}
	
}
