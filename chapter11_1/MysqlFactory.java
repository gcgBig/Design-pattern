package chapter11_1;

/**
 * mysql工厂
 * @author DN
 *
 */
public class MysqlFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new MySqlUser();
	}

	@Override
	public IDept createDept() {
		return new MySqlDept();
	}
	
}
