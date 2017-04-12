package chapter24;

/**
 * 元素类B
 * @author gcg
 * 
 * 2017年4月12日 下午4:34:21
 */
public class ConcreteElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this); // 双分派技术，数据结构和处理分离
	}

}
