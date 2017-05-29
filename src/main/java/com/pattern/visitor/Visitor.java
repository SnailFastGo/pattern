package com.pattern.visitor;

public interface Visitor {
	
	void visit(IntervieweeA interviewee);
	
	void visit(IntervieweeB interviewee);
}
