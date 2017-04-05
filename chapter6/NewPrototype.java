package chapter6;

import java.util.ArrayList;

/**
 * 深拷贝对象
 * @author DN
 *
 */
public class NewPrototype implements Cloneable {

	String name;
	int age;
	ArrayList<String> aa;
	
	public NewPrototype(String name, int age, ArrayList<String> aa) {
		this.name = name;
		this.age = age;
		this.aa = aa;
	}
	
	@SuppressWarnings("unchecked")
	public NewPrototype clone() {
		NewPrototype prototype = null;
		try {
			prototype = (NewPrototype) super.clone();
			prototype.aa = (ArrayList<String>)aa.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}
	
}
