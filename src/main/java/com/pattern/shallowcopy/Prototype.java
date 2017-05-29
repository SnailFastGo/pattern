package com.pattern.shallowcopy;

public class Prototype implements Cloneable{
	
	private String attr;
	
	public Prototype(String attr) {
		this.attr = attr;
	}

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	@Override
	protected Prototype clone(){
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Prototype)object;
	}
	
}
