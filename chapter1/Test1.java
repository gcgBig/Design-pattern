package chapter1;

import java.util.Scanner;

/**
 * 面向过程
 * @author DN
 *
 */
public class Test1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个数：");
		String a = sc.nextLine();
		System.out.println("输入第二个数：");
		String b = sc.nextLine();
		System.out.println("输入运算符：");
		String c = sc.nextLine();
		try {
			switch (c) {
				case "+" :
					System.out.println("运算结果：" + (Double.parseDouble(a) + Double.parseDouble(b)));
					break;
				case "-" :
					System.out.println("运算结果：" + (Double.parseDouble(a) - Double.parseDouble(b)));
					break;
				case "*" :
					System.out.println("运算结果：" + (Double.parseDouble(a) * Double.parseDouble(b)));
					break;
				case "/" :
					if (b.equals("0"))
						System.out.println("运算结果：" + (Double.parseDouble(a) / Double.parseDouble(b)));
					else break;
			}
		} catch (Exception e) {
			System.out.println("输入有误");
		}
	}
	
}
