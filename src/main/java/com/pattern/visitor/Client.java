package com.pattern.visitor;

public class Client {
	public static void main(String[] args) {
		ObjectStruct os = new ObjectStruct();
		Interviewee intervieweeA = new IntervieweeA();
		Interviewee intervieweeB = new IntervieweeB();
		os.attach(intervieweeA);
		os.attach(intervieweeB);
		
		Visitor visitorM = new VisitorM();
		os.display(visitorM);
		
		Visitor visitorN = new VisitorN();
		os.display(visitorN);
	}
}
