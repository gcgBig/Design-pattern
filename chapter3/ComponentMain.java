package chapter3;

/**
 * 装饰模式测试
 * @author DN
 *
 */
public class ComponentMain {

	public static void main(String[] args) {
		ConcreteComponent concreteComponent = new ConcreteComponent();
		ConcreteDecoratorA a = new ConcreteDecoratorA();
		ConcreteDecoratorB b = new ConcreteDecoratorB();
		a.setComponent(concreteComponent);
		b.setComponent(a);
		b.operation();
	}
	
}
