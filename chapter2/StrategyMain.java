package chapter2;

import java.util.Scanner;

/**
 * 策略模式
 * @author DN
 *
 */
public class StrategyMain {

	private static Context context;
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		switch (type) {
		case "1":
			context = new Context(new ConcreteStrategyA());
			break;
		case "2":
			context = new Context(new ConcreteStrategyB());
			break;
		case "3":
			context = new Context(new ConcreteStrategyC());
			break;
		}
		context.ContextInterface();
	}
	
}
