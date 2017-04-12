package chapter22;

/**
 * 具体网站类
 * @author gcg
 * 
 * 2017年4月12日 下午2:32:27
 */
public class ConcreteWebSite extends WebSite {
	
	private String name = "";
	
	public ConcreteWebSite(String name) {
		this.name = name;
	}

	@Override
	public void user(User user) {
		System.out.println("网站分类：" + name + "，用户名密码为：" + user.getUserName());
	}

}
