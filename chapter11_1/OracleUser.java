package chapter11_1;

/**
 * 在oracle中的user
 * @author DN
 *
 */
public class OracleUser implements IUser {

	@Override
	public void insert() {
		System.out.println("user在oracle插入数据");
	}

	@Override
	public void get() {
		System.out.println("user在oracle获取");
	}

}
