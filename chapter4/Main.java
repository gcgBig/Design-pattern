package chapter4;

/**
 * 客户端
 * @author DN
 *
 */
public class Main {

	public static void main(String[] args) {
		SchoolGirl schoolGirl = new SchoolGirl();
		schoolGirl.setName("小红");
		
		Proxy proxy = new Proxy(schoolGirl);
		proxy.giveChocolate();
		proxy.giveDolls();
		proxy.giveFlowers();
	}

}
