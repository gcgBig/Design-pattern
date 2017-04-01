package chapter3;

/**
 * 为对象添加另外的一些职责
 * @author DN
 *
 */
public class ConcreteComponent extends Component {

	@Override
	public void operation() {
		System.out.println("this is ConcreteComponent.opertion");
	}

}
