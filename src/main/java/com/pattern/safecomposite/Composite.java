package com.pattern.safecomposite;

import java.util.HashSet;
import java.util.Set;

public class Composite implements Component{
	
	Set<Component> componentSet = new HashSet<>();

	@Override
	public void sampleOperation() {
		for(Component component : componentSet){
			if(component instanceof Composite){
				// do something , 比如 component.sampleOperation()
			}
			component.sampleOperation();
		}
	}
	
	public boolean add(Component component){
		return componentSet.add(component);
	}
	
	public boolean remove(Component component){
		return componentSet.remove(componentSet);
	}
	
	public Set<Component> getChildren(){
		return componentSet;
	}
}
