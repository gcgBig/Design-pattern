package chapter1;

/**
 * 简单工厂模式
 * @author DN
 *
 */
public class OpertionFactory {

	public NewOpertion getOpertion(String opertioner) {
		NewOpertion oper = null;
		switch (opertioner) {
			case "+":
				oper = new addOpertion();
				break;
			case "-":
				oper = new subtractionOpertion();
				break;
			case "*":
				oper = new multiplicationOpertion();
				break;
			case "/":
				oper = new divisionOpertion();
				break;
		}
		return oper;
	}
	
}
