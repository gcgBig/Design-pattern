package chapter16;

import java.util.List;

/**
 * 迭代器实现类
 * @author gcg
 * 
 * 2017年4月11日 上午10:21:02
 */
public class ConcreteIterator implements Iterator {
	
	private List<Object> lists;
	
	private int current = 0;
	
	public ConcreteIterator(List<Object> lists) {
		this.lists = lists;
	}

	@Override
	public Object next() {
		Object obj = null;
		if (hasNext()) {
			obj = lists.get(current++);
		}
		return obj;
	}

	@Override
	public boolean hasNext() {
		return !(current == lists.size());
	}

}
