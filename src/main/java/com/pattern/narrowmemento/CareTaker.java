package com.pattern.narrowmemento;

public class CareTaker {
	
	private MementoIf memento;

	public MementoIf retrieveMemento() {
		return this.memento;
	}

	public void saveMemento(MementoIf memento) {
		this.memento = memento;
	}
}
