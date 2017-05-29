package com.pattern.visitor;

public class IntervieweeA implements Interviewee{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
