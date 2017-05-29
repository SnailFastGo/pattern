package com.pattern.visitor;

import java.util.HashSet;
import java.util.Set;

public class ObjectStruct {
	private Set<Interviewee> interviewees = new HashSet<Interviewee>();
	
	public boolean attach(Interviewee interviewee){
		return interviewees.add(interviewee);
	}
	
	public boolean detach(Interviewee interviewee){
		return interviewees.remove(interviewee);
	}
	
	public void display(Visitor visitor){
		for(Interviewee interviewee : interviewees){
			interviewee.accept(visitor);
		}
	}
}
