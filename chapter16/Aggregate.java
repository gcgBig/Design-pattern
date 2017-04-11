package chapter16;

/**
 * 集合接口
 * @author gcg
 * 
 * 2017年4月11日 上午10:21:26
 */
interface Aggregate {

	public void add(Object obj);
	
	public void remove(Object obj);
	
	public Iterator iterator();
	
}
