package chapter20;

/**
 * 职责链类B
 * @author gcg
 * 
 * 2017年4月12日 上午9:49:46
 */
public class ConcreteHandleB extends Handle {

	@Override
	public void handleRequest(int request) {
		if (request >= 10 && request <= 20) System.out.println("B处理此请求");
		else handle.handleRequest(request);
	}

}
