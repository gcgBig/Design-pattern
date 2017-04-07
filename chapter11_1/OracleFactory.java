package chapter11_1;

/**
 * oracle工厂
 * @author DN
 *
 */
public class OracleFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new OracleUser();
	}

	@Override
	public IDept createDept() {
		return new OracleDept();
	}

}
