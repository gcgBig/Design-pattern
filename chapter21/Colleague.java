package chapter21;

/**
 * 抽象同事类
 * @author gcg
 * 
 * 2017年4月12日 上午10:23:34
 */
public abstract class Colleague {
	
	Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void send(String message);

	public abstract void answer(String message);

}
