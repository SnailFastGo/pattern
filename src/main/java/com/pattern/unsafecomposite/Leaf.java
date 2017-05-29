package com.pattern.unsafecomposite;

import java.util.Set;

public class Leaf implements Component{

	@Override
	public boolean add(Component component) {
		return false;
	}

	@Override
	public boolean remove(Component component) {
		return false;
	}

	@Override
	public Set<Component> getChildren() {
		return null;
	}

	@Override
	public void sampleOperation() {
		
	}
	
}
