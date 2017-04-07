package chapter12;

/**
 * B状态
 * @author DN
 *
 */
public class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
		System.out.println("B状态");
		context.setState(new ConcreteStateA());
	}

}
