package chapter20;

/**
 * 客户端
 * @author gcg
 * 
 * 2017年4月12日 上午9:53:04
 */
public class Main {

	public static void main(String[] args) {
		Handle handleA = new ConcreteHandleA();
		Handle handleB = new ConcreteHandleB();
		Handle handleC = new ConcreteHandleC();
		
		// 设置职责链下家
		handleA.setHandle(handleB);
		handleB.setHandle(handleC);
		
		int[] a = {1, 9, 23, 89, 15, 69, 11};
		
		for (int i : a) {
			// 处理请求
			handleA.handleRequest(i);
		}
	}
	
}
