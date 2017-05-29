package com.pattern.strategy;

public class Context {
	
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * 无论使用什么策略，最后行为结果是一样的
	 */
	public void action(){
		strategy.algorithm();
	}
}
