package chapter2;

/**
 * 内容上下文
 * @author DN
 *
 */
public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void ContextInterface() {
		strategy.AlgorithmInterface();
	}
	
}
