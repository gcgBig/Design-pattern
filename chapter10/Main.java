package chapter10;

/**
 * 客户端
 * @author DN
 *
 */
public class Main {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		subject.attach(new ConcreteObserver("A", subject));
		subject.attach(new ConcreteObserver("B", subject));
		subject.attach(new ConcreteObserver("C", subject));
		
		subject.setSubjectState("XYZ");
		subject.notifyObserver();
	}
	
}
