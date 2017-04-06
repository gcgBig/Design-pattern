package chapter7;

/**
 * 子类模板B
 * @author DN
 *
 */
public class ConcreteClassB extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("这是B的primitiveOperation1模板方法");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("这是B的primitiveOperation2模板方法");
	}

}
