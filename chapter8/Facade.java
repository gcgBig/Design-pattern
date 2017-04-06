package chapter8;

/**
 * 外观类
 * @author DN
 *
 */
public class Facade {

	SubSystemOne subSystemOne;
	SubSystemTwo subSystemTwo;
	SubSystemThree subSystemThree;
	SubSystemFour subSystemFour;
	
	public Facade() {
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
		subSystemFour = new SubSystemFour();
	}
	
	public void methodA() {
		System.out.println("方法组A");
		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
		subSystemFour.methodFour();
	}
	
	public void methodB() {
		System.out.println("方法组B");
		subSystemTwo.methodTwo();
		subSystemThree.methodThree();
		subSystemFour.methodFour();
	}
	
}
