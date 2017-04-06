package chapter8;

/**
 * 客户端类
 * @author DN
 *
 */
public class Main {

	public static void main(String[] args) {
		Facade facade = new Facade();
		
		facade.methodA();
		facade.methodB();
	}

}
