package chapter21;

/**
 * 抽象中介者类
 * @author gcg
 * 
 * 2017年4月12日 上午10:23:55
 */
public abstract class Mediator {

	public abstract void send(String message, Colleague colleague);
	
}
