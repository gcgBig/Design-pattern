package chapter5;

/**
 * 客户端
 * @author DN
 *
 */
public class Main {

	public static void main(String[] args) {
		LeifengFactory leifengFactory = new StudentLeiFeng();
		LeiFeng leiFeng = leifengFactory.createLeiFeng();
		
		leiFeng.buyRice();
		leiFeng.sweep();
		leiFeng.wash();
	}
	
}
