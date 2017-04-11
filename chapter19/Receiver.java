package chapter19;

/**
 * 执行者，命令接收
 * @author gcg
 * 
 * 2017年4月11日 下午5:15:36
 */
public class Receiver {

	public void action() {
		System.out.println("执行命令..");
	}
	
	public void unAction() {
		System.out.println("撤销命令..");
	}
	
}
