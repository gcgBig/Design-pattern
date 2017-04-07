package chapter11_2;

import chapter11_1.IDept;
import chapter11_1.IUser;
import chapter11_1.MySqlDept;
import chapter11_1.MySqlUser;
import chapter11_1.OracleDept;
import chapter11_1.OracleUser;

/**
 * 数据工厂
 * @author DN
 *
 */
public class DataAccess {

	private static final String DB = "mysql"; // mysql
	// private static final String DB = "oracle"; // oracle
	
	public IUser createUser() {
		IUser user = null;
		switch (DB) {
		case "mysql":
			user = new MySqlUser();
			break;
		default:
			user = new OracleUser();
			break;
		}
		return user;
	}
	
	public IDept createDept() {
		IDept dept = null;
		switch (DB) {
		case "mysql":
			dept = new MySqlDept();
			break;
		default:
			dept = new OracleDept();
			break;
		}
		return dept;
	}
	
}
