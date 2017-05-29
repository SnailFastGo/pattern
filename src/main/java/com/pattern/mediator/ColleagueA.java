package com.pattern.mediator;

public class ColleagueA extends Colleague{
	
	public ColleagueA(){
		
	}
	
	public ColleagueA(String name, String content){
		super(name, content);
	}

	@Override
	public void talk() {
		System.out.println("同学A说：" + this.getContent());
	}
	
}
