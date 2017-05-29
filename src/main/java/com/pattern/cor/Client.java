package com.pattern.cor;

public class Client {
	public static void main(String[] args) {
		Handler handler = new HandlerA(new HandlerB(new HandlerC(new HandlerD(null))));
		handler.request("tom");
	}
}
