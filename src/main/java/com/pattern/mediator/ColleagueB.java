package com.pattern.mediator;

public class ColleagueB extends Colleague{
	
	public ColleagueB(){
		
	}
	
	public ColleagueB(String name, String content){
		super(name, content);
	}

	@Override
	public void talk() {
		System.out.println("同学B说：" + this.getContent());
	}
	
}
