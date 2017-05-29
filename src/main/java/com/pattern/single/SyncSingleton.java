package com.pattern.single;

public class SyncSingleton {
	public volatile static SyncSingleton instance = null;
	
	private SyncSingleton(){
		
	}
	
	public synchronized static SyncSingleton getInstance(){
		if(null == instance){
			instance = new SyncSingleton();
		}
		
		return instance;
	}
}
