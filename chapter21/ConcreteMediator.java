package chapter21;

/**
 * 具体中介者类
 * @author gcg
 * 
 * 2017年4月12日 上午10:40:59
 */
public class ConcreteMediator extends Mediator {
	
	private ConcreteColleagueA concreteColleagueA;
	private ConcreteColleagueB concreteColleagueB;

	// 控制发送
	@Override
	public void send(String message, Colleague colleague) {
		if (colleague == concreteColleagueA) concreteColleagueB.answer(message);
		if (colleague == concreteColleagueB) concreteColleagueA.answer(message);
	}

	public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
		this.concreteColleagueA = concreteColleagueA;
	}

	public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
		this.concreteColleagueB = concreteColleagueB;
	}

}
