package com.pattern.decorator;

public class ConcreteDecorator extends Decorator{
	public ConcreteDecorator(Component component){
		super(component);
	}
	
	
	@Override
	public void operation() {
		// do something
		super.operation();
	}
}

	
