package com.pattern.widememento;

public class Originator {
	
	private String state;
	
	public Originator() {
		
	}

	public Originator(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void restoreMemento(Memento memento){
		this.state = memento.getState();
	}
	
	public Memento createMemento(){
		return new Memento(this.state);
	}
}
