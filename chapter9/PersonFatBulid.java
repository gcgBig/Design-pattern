package chapter9;

/**
 * 创建胖子
 * @author DN
 *
 */
public class PersonFatBulid extends PersonBulid {

	@Override
	public void buildHead() {
		System.out.println("胖子的头");
	}

	@Override
	public void bulidHands() {
		System.out.println("胖子的手");
	}

	@Override
	public void bulidFoots() {
		System.out.println("胖子的脚");
	}

}
