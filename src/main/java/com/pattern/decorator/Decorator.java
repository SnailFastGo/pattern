package com.pattern.decorator;

public abstract class Decorator implements Component{
	
	private Component component;
	
	public Decorator(Component component){
		this.component = component;
	}

	@Override
	public void operation() {
		component.operation();
	}
	
}
