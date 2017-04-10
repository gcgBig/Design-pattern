package chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * 根节点
 * @author DN
 *
 */
public class Composite extends Component {

	public Composite(String name) {
		super(name);
	}

	private List<Component> child = new ArrayList<Component>();

	@Override
	public void add(Component c) {
		child.add(c);
	}

	@Override
	public void remove(Component c) {
		child.remove(c);
	}

	@Override
	public void foreach() {
		System.out.println("节点名：" + name);
		for (Component component : child) {
			component.foreach();
		}
	}
	
}
