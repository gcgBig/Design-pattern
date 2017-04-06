package chapter7;

/**
 * 模板父类
 * @author DN
 *
 */
public abstract class AbstractClass {

	public void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
	}
	
	public abstract void primitiveOperation1();
	
	public abstract void primitiveOperation2();
	
}