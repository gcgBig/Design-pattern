package chapter24;

/**
 * 元素基类
 * @author gcg
 * 
 * 2017年4月12日 下午4:34:00
 */
public abstract class Element {

	public abstract void accept(Visitor visitor);
	
}
