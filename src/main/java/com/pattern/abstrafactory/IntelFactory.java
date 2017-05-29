package com.pattern.abstrafactory;

public class IntelFactory implements Factory{

	@Override
	public Cpu createCpu() {
		Cpu cpu = new IntelCpu();
		System.out.println("Intel工厂生产了一个Intel Cpu");
		return cpu;
	}

	@Override
	public MainBoard createMainBoard() {
		MainBoard mainBoard = new IntelMainBoard();
		System.out.println("Intel工厂生产了一个Intel主板");
		return mainBoard;
	}
	
}
