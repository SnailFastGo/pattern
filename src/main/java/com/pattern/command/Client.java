package com.pattern.command;

public class Client {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command openCommand = new OpenCommand(receiver);
		Command closeCommand = new CloseCommand(receiver);
		Invoker invoker = new Invoker();
		invoker.setOpenCommand(openCommand);
		invoker.setCloseCommand(closeCommand);
		invoker.open();
		invoker.close();
	}
}
