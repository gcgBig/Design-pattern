package chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端类
 * @author gcg
 * 
 * 2017年4月11日 上午10:21:51
 */
public class Main {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("g");
		list.add("c");
		list.add("g");
		
		Aggregate aggregate = new ConcreteAggregate(list);
		Iterator iterator = aggregate.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
	
}
