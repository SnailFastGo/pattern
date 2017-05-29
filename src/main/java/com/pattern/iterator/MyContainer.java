package com.pattern.iterator;

public class MyContainer implements MyIterable{
	private Object[] container;
	
	private int lastIndex;
	
	public MyContainer(int maxSize){
		container = new Object[maxSize];
		lastIndex = 0;
	}
	
	public boolean add(Object object){
		if(lastIndex >=  container.length -1){
			return false;
		}
		container[lastIndex ++] = object;
		return true;
	}
	
	@Override
	public MyIterator myIterator() {
		return new InnerIterator();
	}



	private class InnerIterator implements MyIterator{
		private int cur;
		
		@Override
		public boolean hasNext() {
			return cur != lastIndex;
		}

		@Override
		public Object next() {
			return container[cur ++];
		}
		
	}
}
