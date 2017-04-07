package chapter11_1;

/**
 * mysql的dept操作类
 * @author DN
 *
 */
public class MySqlDept implements IDept {

	@Override
	public void insert() {
		System.out.println("dept的mysql插入");
	}

	@Override
	public void get() {
		System.out.println("dept的mysql获取");
	}

}
