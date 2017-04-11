package chapter17;

/**
 * 饿汉模式，虽然避免多线程问题但没有实现懒加载
 * @author gcg
 * 
 * 2017年4月11日 下午2:13:24
 */
public class Singleton3 {

	private static Singleton3 singleton3 = new Singleton3();
	
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
		return singleton3;
	}
	
}
