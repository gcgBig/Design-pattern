package chapter1;

/**
 * 操作类
 * @author DN
 *
 */
public class Opertion {

	public static double opertion(String num1, String num2, String oper) {
		try {
			double result = 0;
			switch (oper) {
				case "+" :
					result = Double.parseDouble(num1) + Double.parseDouble(num2);
					break;
				case "-" :
					result = Double.parseDouble(num1) - Double.parseDouble(num2);
					break;
				case "*" :
					result = Double.parseDouble(num1) * Double.parseDouble(num2);
					break;
				case "/" :
					if (num2.equals("0"))
						result = Double.parseDouble(num1) / Double.parseDouble(num2);
					else break;
			}
			return result;
		} catch (Exception e) {
			System.out.println("输入有误");
		}
		return 0;
	}
	
}
