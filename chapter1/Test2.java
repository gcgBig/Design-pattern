package chapter1;

import java.util.Scanner;

/**
 * 业务类
 * @author DN
 *
 */
public class Test2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个数：");
		String a = sc.nextLine();
		System.out.println("输入第二个数：");
		String b = sc.nextLine();
		System.out.println("输入运算符：");
		String c = sc.nextLine();
		double result = Opertion.opertion(a, b, c);
		System.out.println("运算结果" + result);
	}
	
}
