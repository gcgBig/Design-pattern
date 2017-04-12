package chapter22;

/**
 * 用户类（外部状态）
 * @author gcg
 * 
 * 2017年4月12日 下午2:25:51
 */
public class User {

	private String userName;
	
	public User(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
	
}
