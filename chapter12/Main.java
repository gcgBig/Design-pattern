package chapter12;

/**
 * 客户端
 * @author DN
 *
 */
public class Main {

	public static void main(String[] args) {
		Context c = new Context(new ConcreteStateA());
		c.request();
		c.request();
		c.request();
		c.request();
	}

}
