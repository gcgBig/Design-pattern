package chapter9;

/**
 * 客户端
 * @author DN
 *
 */
public class Main {

	public static void main(String[] args) {
		//创建胖子
		PersonBulid personBulid = new PersonFatBulid();
		Directer directer = new Directer(personBulid);
		directer.buildPerson();
		
		// 创建瘦子
		personBulid = new PersonThinBulid();
		directer = new Directer(personBulid);
		directer.buildPerson();
	}
	
}
