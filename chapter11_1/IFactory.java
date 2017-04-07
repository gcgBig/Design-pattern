package chapter11_1;

/**
 * 抽象工厂接口
 * @author DN
 *
 */
public interface IFactory {

	public IUser createUser();
	
	public IDept createDept();
	
}
