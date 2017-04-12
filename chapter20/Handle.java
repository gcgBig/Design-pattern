package chapter20;

/**
 * 职责链基类
 * @author gcg
 * 
 * 2017年4月12日 上午9:46:09
 */
public abstract class Handle {

	Handle handle;

	public void setHandle(Handle handle) {
		this.handle = handle;
	}
	
	public abstract void handleRequest(int request);
	
}
