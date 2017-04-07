package chapter11_1;

/**
 * dept的oracle操作
 * @author DN
 *
 */
public class OracleDept implements IDept {

	@Override
	public void insert() {
		System.out.println("dept的oracle插入");
	}

	@Override
	public void get() {
		System.out.println("dept的oracle获取");
	}

}
