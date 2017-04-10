package chapter15;

/**
 * 默认实现接口
 * @author DN
 *
 */
public abstract class Component {

	public String name;
	
	public Component(String name) {
		this.name = name;
	}
	
	public abstract void add(Component c);
	
	public abstract void remove(Component c);
	
	public abstract void foreach();
	
}