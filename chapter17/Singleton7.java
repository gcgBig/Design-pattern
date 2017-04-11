package chapter17;

/**
 * 双重校验锁
 * @author gcg
 * 
 * 2017年4月11日 下午2:56:07
 */
public class Singleton7 {

	private static volatile Singleton7 singleton7;
	
	private Singleton7() {}
	
	public static Singleton7 getInstance() {
		if (singleton7 == null) {
			synchronized(Singleton7.class) {
				if (singleton7 == null) singleton7 = new Singleton7();
			}
		}
		return singleton7;
	}
	
}
