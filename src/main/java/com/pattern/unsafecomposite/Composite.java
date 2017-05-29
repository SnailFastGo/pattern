package com.pattern.unsafecomposite;

import java.util.HashSet;
import java.util.Set;

public class Composite implements Component{
	
	private Set<Component> componentSet = new HashSet<Component>();

	@Override
	public boolean add(Component component) {
		return componentSet.add(component);
	}

	@Override
	public boolean remove(Component component) {
		return componentSet.remove(component);
	}

	@Override
	public Set<Component> getChildren() {
		return componentSet;
	}

	@Override
	public void sampleOperation() {
		for(Component component : componentSet){
			if(component instanceof Composite){
				//do something
			}
			component.sampleOperation();
		}
	}
	
}
