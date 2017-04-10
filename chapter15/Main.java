package chapter15;

/**
 * 客户端
 * @author DN
 *
 */
public class Main {

	public static void main(String[] args) {
		Component component = new Composite("根节点");
		
		// 第一个节点
		Component child1 = new Composite("子节点1");
		Component child_1 = new Leaf("子节点1下的子节点1");
		Component child_2 = new Leaf("子节点1下的子节点2");
		child1.add(child_1);
		child1.add(child_2);
		
		// 第二个节点
		Component child2 = new Composite("子节点2");
		
		component.add(child1);
		component.add(child2);
		component.foreach();
	}
	
}
