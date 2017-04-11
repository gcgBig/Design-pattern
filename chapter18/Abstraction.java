package chapter18;

/**
 * 抽象基类
 * @author gcg
 * 
 * 2017年4月11日 下午3:57:09
 */
public class Abstraction {
	
	protected Implementor implementor;

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public void opertion() {
		implementor.opertion();
	}

}
