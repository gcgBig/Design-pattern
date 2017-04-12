package chapter22;

import java.util.HashMap;

/**
 * 网站实例工厂
 * @author gcg
 * 
 * 2017年4月12日 下午2:40:01
 */
public class WebSiteFactory {

	private HashMap<String, WebSite> map = new HashMap<String, WebSite>();
	
	/**
	 * 获取实例
	 * @param key 网站名
	 * @return 网站实例
	 */
	public WebSite getWebSiteCategory(String key) {
		if (!map.containsKey(key))
			map.put(key, new ConcreteWebSite(key));
		return map.get(key);
	}
	
	/**
	 * 实例总数
	 * @return 数量
	 */
	public int getWebSiteCount() {
		return map.size();
	}
	
}
