package com.pattern.flyweight;

/** 享元对象
 * @author snailfast
 *
 */
public class WebSite {
	//网站的名称
	private String name;
	
	public WebSite(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
