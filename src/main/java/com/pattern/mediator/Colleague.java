package com.pattern.mediator;

/**同事基类，需要沟通的人
 * @author snailfast
 *
 */
public abstract class Colleague {
	
	private String name;
	
	private String content;
	
	public Colleague(){
		
	}

	public Colleague(String name, String content) {
		this.name = name;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public abstract void talk();
}
