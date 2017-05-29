package com.pattern.cor;

public abstract class Handler {
	private Handler nextHandler;

	public Handler(){
		
	}
	
	public Handler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public void request(String param){
//		this.before();
		
		if(null != nextHandler){
			nextHandler.request(param);
		}else{
			System.out.println("Hello! " + param);
			System.out.println("责任链已处理完请求");
		}
		
//		this.after();
	}
	
	public void before(){
		System.out.println(this.getClass().getName() + "接收了请求");
	}
	
	public void after(){
		System.out.println(this.getClass().getName() + "返回了响应");
	}
}
