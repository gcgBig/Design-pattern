package chapter22;

/**
 * 客户端
 * @author gcg
 * 
 * 2017年4月12日 下午2:41:12
 */
public class Main {

	public static void main(String[] args) {
		WebSiteFactory factory = new WebSiteFactory();
		
		WebSite s1 = factory.getWebSiteCategory("A");
		s1.user(new User("a"));
		
		WebSite s2 = factory.getWebSiteCategory("A");
		s2.user(new User("b"));
		
		WebSite s3 = factory.getWebSiteCategory("A");
		s3.user(new User("c"));
		
		WebSite s4 = factory.getWebSiteCategory("B");
		s4.user(new User("d"));
		
		WebSite s5 = factory.getWebSiteCategory("B");
		s5.user(new User("e"));
		
		WebSite s6 = factory.getWebSiteCategory("B");
		s6.user(new User("f"));
		
		System.out.println("总数为：" + factory.getWebSiteCount());
	}
	
}
