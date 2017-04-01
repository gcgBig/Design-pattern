package chapter3;

/**
 * 装饰类B
 * @author DN
 *
 */
public class ConcreteDecoratorB extends Decorator {

	public void operation() {
		super.operation();
		System.out.println("this is ComponentDecoratorB.operation");
	}
	
}
