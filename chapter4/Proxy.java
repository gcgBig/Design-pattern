package chapter4;

/**
 * 代理类
 * @author DN
 *
 */
public class Proxy implements GiveGift {
	
	private Pursuit pursuit;
	
	public Proxy(SchoolGirl schoolGirl) {
		this.pursuit = new Pursuit(schoolGirl);
	}

	@Override
	public void giveDolls() {
		pursuit.giveDolls();
	}

	@Override
	public void giveFlowers() {
		pursuit.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		pursuit.giveChocolate();
	}

}
