package chapter21;

/**
 * 客户端
 * @author gcg
 * 
 * 2017年4月12日 上午10:46:19
 */
public class Main {

	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();
		
		// 同事中设置中介者
		ConcreteColleagueA c1 = new ConcreteColleagueA(m);
		ConcreteColleagueB c2 = new ConcreteColleagueB(m);
		
		// 中介者认识同事
		m.setConcreteColleagueA(c1);
		m.setConcreteColleagueB(c2);
		
		c1.send("吃放了没？");
		c2.send("没啊");
	}

}
