package com.pattern.narrowmemento;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("true");
		System.out.println("现在状态为：" + originator.getState());
		
//		备忘状态
		MementoIf memento = originator.createMemento();
		CareTaker taker = new CareTaker();
		taker.saveMemento(memento);
		
//		改变状态
		originator.setState("false");
		System.out.println("现在状态为：" + originator.getState());
		
//		恢复状态
		MementoIf mementoOld = taker.retrieveMemento();
		originator.restoreMemento(mementoOld);
		System.out.println("现在状态为：" + originator.getState());
	}
}
