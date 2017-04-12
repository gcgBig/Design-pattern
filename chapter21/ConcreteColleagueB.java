package chapter21;

/**
 * 同事B
 * @author gcg
 * 
 * 2017年4月12日 上午10:35:25
 */
public class ConcreteColleagueB extends Colleague {

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
	}

	// 发送消息
	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	// 回答
	@Override
	public void answer(String message) {
		System.out.println("B同事收到消息" + message);
	}

}
