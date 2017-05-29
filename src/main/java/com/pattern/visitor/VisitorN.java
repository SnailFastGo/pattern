package com.pattern.visitor;

public class VisitorN implements Visitor{

	@Override
	public void visit(IntervieweeA interviewee) {
		System.out.println("VisitorN采访了IntervieweeA");
	}

	@Override
	public void visit(IntervieweeB interviewee) {
		System.out.println("VisitorN采访了IntervieweeB");
	}
	
}
