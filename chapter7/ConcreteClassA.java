package chapter7;

/**
 * 子类模板A
 * @author DN
 *
 */
public class ConcreteClassA extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("这是A的primitiveOperation1模板方法");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("这是A的primitiveOperation2模板方法");
	}

}
