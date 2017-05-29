package com.pattern.visitor;

public class IntervieweeB implements Interviewee{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
