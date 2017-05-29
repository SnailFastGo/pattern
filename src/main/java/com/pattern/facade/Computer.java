package com.pattern.facade;

public class Computer {
	
	private Cpu cpu;
	
	private Memory memory;
	
	private MainBoard mainBoard;
	
	private Disk disk;
	
	public Computer(Cpu cpu, Memory memory, MainBoard mainBoard, Disk disk) {
		this.cpu = cpu;
		this.memory = memory;
		this.mainBoard = mainBoard;
		this.disk = disk;
	}

	public void startup(){
		this.mainBoard.startup();
		this.cpu.startup();
		this.memory.startup();
		this.disk.startup();
	}
	
	public void shutdown(){
		this.mainBoard.shutdown();
		this.cpu.shutdown();
		this.memory.shutdown();
		this.disk.shutdown();
	}
}
