package chapter2;

import java.util.Scanner;

/**
 * 简单工厂与策略模式结合测试类
 * @author DN
 *
 */
public class NewStrategyMain {

	private static NewContext newContext;
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		newContext = new NewContext(type);
		newContext.ContextInterface();
	}
	
}
