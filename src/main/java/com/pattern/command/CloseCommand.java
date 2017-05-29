package com.pattern.command;

/** Close命令,需要安插在命令面板上
 * @author snailfast
 *
 */
public class CloseCommand implements Command{
	
	private Receiver receiver;
	
	public CloseCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.close();
	}
	
}
