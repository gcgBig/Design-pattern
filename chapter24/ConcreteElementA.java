package chapter24;

/**
 * 元素类A
 * @author gcg
 * 
 * 2017年4月12日 下午4:34:13
 */
public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

}
