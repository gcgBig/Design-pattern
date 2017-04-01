package chapter3;

/**
 * 装饰抽象类基础
 * @author DN
 *
 */
public class Decorator extends Component {
	
	private Component component;

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		if (component != null)
			component.operation();
	}

}
