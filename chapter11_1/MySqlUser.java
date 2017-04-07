package chapter11_1;

/**
 * user在mysql的操作
 * @author DN
 *
 */
public class MySqlUser implements IUser {

	@Override
	public void insert() {
		System.out.println("user在mysql的插入");
	}

	@Override
	public void get() {
		System.out.println("user在mysql的获取");
	}

}
