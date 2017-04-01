package chapter3;

/**
 * 装饰类A
 * @author DN
 *
 */
public class ConcreteDecoratorA extends Decorator {

	public void operation() {
		super.operation();
		System.out.println("this is ComponentDecoratorA.operation");
	}
	
}
