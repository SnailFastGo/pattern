package com.pattern.mediator;

import java.util.HashSet;
import java.util.Set;

/** 中介者基类
 * @author snailfast
 *
 */
public abstract class Media {
	private Set<Colleague> Colleagues = new HashSet<Colleague>();
	
	public boolean add(Colleague colleague){
		return Colleagues.add(colleague);
	}
	
	/* 通知所有同事
	 * @see com.pattern.mediator.Media#notify(java.util.Set)
	 */
	public abstract void notify(Set<Colleague> Colleagues);
	
	/* 同事A和同事B沟通
	 * @see com.pattern.mediator.Media#chart(com.pattern.mediator.Colleague, com.pattern.mediator.Colleague)
	 */
	public abstract void chart(Colleague colleagueA, Colleague colleagueB);
	
}
