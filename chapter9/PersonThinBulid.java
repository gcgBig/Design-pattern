package chapter9;

/**
 * 创建瘦子
 * @author DN
 *
 */
public class PersonThinBulid extends PersonBulid {

	@Override
	public void buildHead() {
		System.out.println("瘦子的头");
	}

	@Override
	public void bulidHands() {
		System.out.println("瘦子的手");
	}

	@Override
	public void bulidFoots() {
		System.out.println("瘦子的脚");
	}

}
