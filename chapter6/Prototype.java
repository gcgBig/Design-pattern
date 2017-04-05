package chapter6;

import java.util.List;

/**
 * 浅拷贝对象
 * @author DN
 *
 */
public class Prototype implements Cloneable {

	String name;
	int age;
	List<String> aa;
	
	public Prototype(String name, int age, List<String> aa) {
		this.name = name;
		this.age = age;
		this.aa = aa;
	}
	
	public Prototype clone() {
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}
	
}
