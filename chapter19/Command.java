package chapter19;

/**
 * 命令接口
 * @author gcg
 * 
 * 2017年4月11日 下午5:15:26
 */
public interface Command {

	public void execute();
	
	public void undo();
	
}
