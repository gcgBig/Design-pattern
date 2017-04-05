package chapter4;

/**
 * 追求者
 * @author DN
 *
 */
public class Pursuit implements GiveGift {
	
	private SchoolGirl schoolGirl;
	
	public Pursuit(SchoolGirl schoolGirl) {
		this.schoolGirl = schoolGirl;
	}

	public SchoolGirl getSchoolGirl() {
		return schoolGirl;
	}

	public void setSchoolGirl(SchoolGirl schoolGirl) {
		this.schoolGirl = schoolGirl;
	}

	@Override
	public void giveDolls() {
		System.out.println(schoolGirl.getName() + "，送你洋娃娃");
	}

	@Override
	public void giveFlowers() {
		System.out.println(schoolGirl.getName() + "，送你小花");
	}

	@Override
	public void giveChocolate() {
		System.out.println(schoolGirl.getName() + "，送你巧克力");
	}

}
