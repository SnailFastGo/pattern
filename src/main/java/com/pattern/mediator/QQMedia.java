package com.pattern.mediator;

import java.util.Set;

/**QQ平台充当中介者
 * @author snailfast
 *
 */
public class QQMedia extends Media{

	/* 使用QQ通知所有同事
	 * @see com.pattern.mediator.Media#notify(java.util.Set)
	 */
	@Override
	public void notify(Set<Colleague> Colleagues) {
		for(Colleague colleague : Colleagues){
			colleague.talk();
		}
	}

	/* 同事A和同事B使用QQ沟通
	 * @see com.pattern.mediator.Media#chart(com.pattern.mediator.Colleague, com.pattern.mediator.Colleague)
	 */
	@Override
	public void chart(Colleague colleagueA, Colleague colleagueB) {
		colleagueA.talk();
		colleagueB.talk();
	}
	
}
