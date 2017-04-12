package chapter20;

/**
 * 职责链类C
 * @author gcg
 * 
 * 2017年4月12日 上午9:52:27
 */
public class ConcreteHandleC extends Handle {

	@Override
	public void handleRequest(int request) {
		if (request >= 20) System.out.println("C处理此请求");
		else handle.handleRequest(request);		
	}

}
