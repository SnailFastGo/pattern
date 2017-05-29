package com.pattern.bridge;

/**使用桥梁模式将实体和事件分开实现，利用组合关系将相乘变成相加
 * @author snailfast
 *
 */
public class Client {
	public static void main(String[] args) {
		Action actionA = new ActionA();
		Action actionB = new ActionB();
		Action actionC = new ActionC();
		
		Entry entryA = new EntryA(actionA);
		entryA.request("tom");
		
		entryA.setAction(actionB);
		entryA.request("tom");
		
		entryA.setAction(actionC);
		entryA.request("tom");
		
		Entry entryB = new EntryB(actionA);
		entryB.request("tom");
		
		entryB.setAction(actionB);
		entryB.request("tom");
		
		entryB.setAction(actionC);
		entryB.request("tom");
	}
}
