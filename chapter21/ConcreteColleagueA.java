package chapter21;

/**
 * 同事A
 * @author gcg
 * 
 * 2017年4月12日 上午10:35:17
 */
public class ConcreteColleagueA extends Colleague {

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}

	// 发送消息
	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	// 回应
	@Override
	public void answer(String message) {
		System.out.println("同事A收到消息" + message);
	}

}
