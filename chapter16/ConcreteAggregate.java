package chapter16;

import java.util.List;

/**
 * 集合实现类
 * @author gcg
 * 
 * 2017年4月11日 上午10:21:37
 */
public class ConcreteAggregate implements Aggregate {
	
	private List<Object> lists;
	
	public ConcreteAggregate(List<Object> lists) {
		this.lists = lists;
	}

	@Override
	public void add(Object obj) {
		lists.add(obj);
	}

	@Override
	public void remove(Object obj) {
		lists.remove(obj);
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(lists);
	}

}
