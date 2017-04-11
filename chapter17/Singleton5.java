package chapter17;

/**
 * 静态内部类模式，在类加载时不一定会加载实例，可以有我们自己控制，相比3和4比较合理
 * @author gcg
 * 
 * 2017年4月11日 下午2:20:21
 */
public class Singleton5 {

	private static class SingletonHodler {
		private static final Singleton5 singleton5 = new Singleton5();
	}
	
	private Singleton5() {}
	
	public static final Singleton5 getInstance() {
		return SingletonHodler.singleton5;
	}
	
}
