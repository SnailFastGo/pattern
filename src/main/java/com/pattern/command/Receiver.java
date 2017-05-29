package com.pattern.command;

/**命令的真正执行者，相当于电视机
 * @author snailfast
 *
 */
public class Receiver {
	
	public void open(){
		System.out.println("open");
	}
	
	public void close(){
		System.out.println("close");
	}
}
