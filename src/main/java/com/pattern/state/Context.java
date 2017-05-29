package com.pattern.state;

public class Context {
	
	private State state;

	/**改变状态
	 * @param state
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**状态不同，最后的行为结果也不同
	 * @param param
	 */
	public void request(String param){
		state.hand(param);
	}
}
