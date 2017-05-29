package com.pattern.narrowmemento;

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
	
	public void restoreMemento(MementoIf memento){
		this.state =((Memento)memento).getState();
	}
	
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	private class Memento implements MementoIf{
		private String state;
		
		private Memento(String state){
			this.state = state;
		}

		private String getState() {
			return state;
		}

		private void setState(String state) {
			this.state = state;
		}
	}
}
