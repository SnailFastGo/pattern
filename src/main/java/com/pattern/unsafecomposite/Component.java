package com.pattern.unsafecomposite;

import java.util.Set;

public interface Component {
	boolean add(Component component);
	
	boolean remove(Component component);
	
	Set<Component> getChildren();
	
	void sampleOperation();
}
