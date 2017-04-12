package chapter24;

/**
 * 具体访问者B
 * @author gcg
 * 
 * 2017年4月12日 下午4:31:29
 */
public class ConcreteVisitorB extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("elementA被visitorB访问");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("elementB被visitorB访问");
	}

}
