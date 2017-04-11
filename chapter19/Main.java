package chapter19;

/**
 * 客户端
 * @author gcg
 * 
 * 2017年4月11日 下午5:19:14
 */
public class Main {

	public static void main(String[] args) {
		//创建接受者
		Receiver receiver = new Receiver();
		//命令创建
		Command command = new CreateCommand(receiver);
		
		//调用命令的人
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		
		invoker.runCommand();
		invoker.undoCommand();
	}
	
}
