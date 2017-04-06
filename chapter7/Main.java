package chapter7;

/**
 * 客户端运行
 * @author DN
 *
 */
public class Main {

	public static void main(String[] args) {
		AbstractClass a = new ConcreteClassA();
		a.templateMethod();
		
		AbstractClass b = new ConcreteClassB();
		b.templateMethod();
	}
	
}
