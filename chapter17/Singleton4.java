package chapter17;

/**
 * 变种饿汉模式，和饿汉模式没有什么区别
 * @author gcg
 * 
 * 2017年4月11日 下午2:16:05
 */
public class Singleton4 {

	private static Singleton4 singleton4;
	
	static {
		singleton4 = new Singleton4();
	}
	
	private Singleton4() {}
	
	public static Singleton4 getInstance() {
		return singleton4;
	}
	
}
