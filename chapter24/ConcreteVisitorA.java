package chapter24;

/**
 * 具体访问者A
 * @author gcg
 * 
 * 2017年4月12日 下午4:30:22
 */
public class ConcreteVisitorA extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("elementA被visitorA访问");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("elementB被visitorA访问");
	}

}
