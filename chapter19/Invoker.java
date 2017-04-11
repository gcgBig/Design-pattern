package chapter19;

/**
 * 发出命令人
 * @author gcg
 * 
 * 2017年4月11日 下午5:16:11
 */
public class Invoker {
	
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void runCommand() {
		command.execute();
	}
	
	public void undoCommand() {
		command.undo();
	}

}
