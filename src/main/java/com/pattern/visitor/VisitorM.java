package com.pattern.visitor;

public class VisitorM implements Visitor{

	@Override
	public void visit(IntervieweeA interviewee) {
		System.out.println("VisitorM采访了IntervieweeA");
	}

	@Override
	public void visit(IntervieweeB interviewee) {
		System.out.println("VisitorM采访了IntervieweeB");
	}
	
}
