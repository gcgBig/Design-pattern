package chapter18;

/**
 * 客户端
 * @author gcg
 * 
 * 2017年4月11日 下午3:49:54
 */
public class Main {

	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();
		
		ab.setImplementor(new ConcreteImplementorA());
		ab.opertion();
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.opertion();
	}

}
