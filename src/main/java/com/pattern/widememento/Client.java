package com.pattern.widememento;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("true");
		System.out.println("现在状态为：" + originator.getState());
		
//		备忘状态
		Memento memento = originator.createMemento();
		CareTaker taker = new CareTaker();
		taker.saveMemento(memento);
		
//		改变状态
		originator.setState("false");
		System.out.println("现在状态为：" + originator.getState());
		
//		恢复状态
		Memento mementoOld = taker.retrieveMemento();
		originator.restoreMemento(mementoOld);
		System.out.println("现在状态为：" + originator.getState());
	}
}
