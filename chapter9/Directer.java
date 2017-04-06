package chapter9;

/**
 * 指挥者
 * @author DN
 *
 */
public class Directer {
	
	private PersonBulid personBulid;

	public Directer(PersonBulid personBulid) {
		this.personBulid = personBulid;
	}
	
	public void buildPerson() {
		personBulid.buildHead();
		personBulid.bulidHands();
		personBulid.bulidFoots();
	}
	
}
