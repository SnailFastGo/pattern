package com.pattern.command;

/** 命令面板，相当于遥控器，组装什么命令就有什么功能
 * @author snailfast
 *
 */
public class Invoker {
	private Command openCommand;
	
	private Command closeCommand;

	public void setOpenCommand(Command openCommand) {
		this.openCommand = openCommand;
	}

	public void setCloseCommand(Command closeCommand) {
		this.closeCommand = closeCommand;
	}
	
	public void open(){
		this.openCommand.execute();
	}
	
	public void close(){
		this.closeCommand.execute();
	}
}
