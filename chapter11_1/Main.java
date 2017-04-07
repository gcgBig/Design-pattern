package chapter11_1;

/**
 * 客户端代码
 * @author DN
 *
 */
public class Main {

	public static void main(String[] args) {
		// mysql工厂
		IFactory factory = new MysqlFactory();
		
		IDept dept = factory.createDept();
		dept.insert();
		dept.get();
		
		IUser user = factory.createUser();
		user.insert();
		user.get();
		
		// oracle工厂
		factory = new OracleFactory();
		dept = factory.createDept();
		dept.insert();
		dept.get();
		
		user = factory.createUser();
		user.insert();
		user.get();
	}
	
}
