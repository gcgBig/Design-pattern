package chapter12;

/**
 * A状态
 * @author DN
 *
 */
public class ConcreteStateA extends State {

	@Override
	public void handle(Context context) {
		System.out.println("A状态");
		context.setState(new ConcreteStateB());
	}

}
