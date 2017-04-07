package chapter13;

/**
 * 适配器类
 * @author DN
 *
 */
public class Adapter extends Target {

	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		adaptee.specificRequest();
	}
	
}
