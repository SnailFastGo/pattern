package com.pattern.cor;

public class HandlerD extends Handler{
	
	public HandlerD(Handler handler){
		super(handler);
	}

	@Override
	public void request(String param) {
		System.out.println("HandlerD接收了请求");
		super.request(param);
		System.out.println("HandlerD返回了响应");
	}
	
}
