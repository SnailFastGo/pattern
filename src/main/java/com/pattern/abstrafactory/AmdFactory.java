package com.pattern.abstrafactory;

public class AmdFactory implements Factory{

	@Override
	public Cpu createCpu() {
		Cpu cpu = new AmdCpu();
		System.out.println("AMD工厂生产了一个ADM CPU");
		return cpu;
	}

	@Override
	public MainBoard createMainBoard() {
		MainBoard mainBoard = new AmdMainBoard();
		System.out.println("AMD工厂生产了一个ADM 主板");
		return mainBoard;
	}

}
