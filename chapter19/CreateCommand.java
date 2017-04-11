package chapter19;

/**
 * 命令
 * @author gcg
 * 
 * 2017年4月11日 下午5:18:52
 */
public class CreateCommand implements Command {

	private Receiver receiver;
	
	public CreateCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}

	@Override
	public void undo() {
		receiver.unAction();
	}
	
}
