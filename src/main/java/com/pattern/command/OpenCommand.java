package com.pattern.command;

/** Open命令，需要安插在命名面板上
 * @author snailfast
 *
 */
public class OpenCommand implements Command{
	
//	命令的真正执行者
	private Receiver receiver;
	
	public OpenCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.open();
	}
}
