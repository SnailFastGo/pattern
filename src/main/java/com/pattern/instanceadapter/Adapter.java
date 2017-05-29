package com.pattern.instanceadapter;

public class Adapter implements Target{
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}

	@Override
	public int get110v() {
		return this.adaptee.get110v();
	}

	@Override
	public int get220v() {
		return 220;
	}
}
