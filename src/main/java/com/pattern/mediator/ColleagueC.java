package com.pattern.mediator;

public class ColleagueC extends Colleague{
	
	public ColleagueC(){
		
	}
	
	public ColleagueC(String name, String content){
		super(name, content);
	}

	@Override
	public void talk() {
		System.out.println("同学C说：" + this.getContent());
	}
	
}
