package chapter20;

/**
 * 职责链类A
 * @author gcg
 * 
 * 2017年4月12日 上午9:47:22
 */
public class ConcreteHandleA extends Handle {

	@Override
	public void handleRequest(int request) {
		if (request < 10) System.out.println("A处理此请求"); 
		else handle.handleRequest(request);
	}

}
