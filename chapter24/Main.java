package chapter24;

/**
 * 客户端
 * @author gcg
 * 
 * 2017年4月12日 下午4:41:33
 */
public class Main {

	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementB());
		
		Visitor visitor1 = new ConcreteVisitorA();
		Visitor visitor2 = new ConcreteVisitorB();
		
		objectStructure.foreach(visitor1);
		objectStructure.foreach(visitor2);
	}
	
}
