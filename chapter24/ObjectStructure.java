package chapter24;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问元素类
 * @author gcg
 * 
 * 2017年4月12日 下午4:38:05
 */
public class ObjectStructure {

	private List<Element> elements = new ArrayList<Element>();
	
	public void add(Element element) {
		elements.add(element);
	}
	
	public void remove(Element element) {
		elements.remove(element);
	}
	
	public void foreach(Visitor visitor) {
		for (Element element : elements) {
			element.accept(visitor);
		}
	}
	
}
