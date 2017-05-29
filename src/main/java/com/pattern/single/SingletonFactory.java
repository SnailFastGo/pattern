package com.pattern.single;

import java.util.HashMap;
import java.util.Map;

public class SingletonFactory {
	private final static Map<String, Object> factory = new HashMap<String, Object>();
	
	/**
	 * @param className 类的全限定名
	 * @return 指定类的实例
	 */
	public static Object getInstance(String className){
		if(null == className || "".equals(className)){
			return null;
		}
		
		Object object = factory.get(className);
		if(null == object){
			try {
				object = Class.forName(className).newInstance();
				factory.put(className, object);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		 return object;
	}
}
