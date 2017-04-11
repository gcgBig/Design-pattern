package chapter17;

/**
 * 懒汉模式，线程安全，但是效率极低
 * @author gcg
 * 
 * 2017年4月11日 下午2:08:57
 */
public class Singleton2 {

	private Singleton2() {}
	
	private static Singleton2 singleton2;
	
	public static synchronized Singleton2 getInstance() {
		if (singleton2 == null) singleton2 = new Singleton2();
		return singleton2;
	}
	
}
