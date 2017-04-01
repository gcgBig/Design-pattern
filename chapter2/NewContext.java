package chapter2;

/**
 * 新的context上下文
 * @author DN
 *
 */
public class NewContext {

	private Strategy strategy;
	
	public NewContext(String type) {
		switch (type) {
		case "1":
			strategy = new ConcreteStrategyA();
			break;
		case "2":
			strategy = new ConcreteStrategyB();
			break;
		case "3":
			strategy = new ConcreteStrategyC();
			break;
		}
	}
	
	public void ContextInterface() {
		strategy.AlgorithmInterface();
	}
	
}
