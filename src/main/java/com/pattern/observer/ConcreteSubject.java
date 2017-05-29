package com.pattern.observer;

import java.util.HashSet;
import java.util.Set;

public class ConcreteSubject implements Subject{
	
	private Set<Observer> observers = new HashSet<Observer>();

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers){
			observer.update(this);
		}
	}
	
}
