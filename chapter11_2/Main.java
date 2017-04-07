package chapter11_2;

import chapter11_1.IDept;
import chapter11_1.IUser;

/**
 * 客户端
 * @author DN
 *
 */
public class Main {

	public static void main(String[] args) {
		DataAccess dataAccess = new DataAccess();
		IUser user = dataAccess.createUser();
		user.insert();
		user.get();
		
		IDept dept = dataAccess.createDept();
		dept.insert();
		dept.get();
	}

}
