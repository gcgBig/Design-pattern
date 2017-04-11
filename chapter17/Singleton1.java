package chapter17;

/**
 * 懒汉模式，线程不安全
 * @author gcg
 * 
 * 2017年4月11日 下午1:58:31
 */
public class Singleton1 {
	
	private static Singleton1 singleton1;

	private Singleton1(){}
	
	public static Singleton1 getInstance() {
		if (singleton1 == null) singleton1 = new Singleton1();
		return singleton1;
	}
	
}
