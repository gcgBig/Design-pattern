package chapter6;

import java.util.ArrayList;

/**
 * 深拷贝客户端
 * @author DN
 *
 */
public class NewMain {

	public static void main(String[] args) {
		ArrayList<String> aa = new ArrayList<String>();
		aa.add("a");
		NewPrototype prototype = new NewPrototype("aa", 11, aa);
		
		NewPrototype newPrototype = prototype.clone();
		System.out.println(newPrototype.age + " " + newPrototype.name);
		for (String string : newPrototype.aa) {
			System.out.println(string);
		}
		aa.add("tt");
		for (String string : newPrototype.aa) {
			System.out.println(string);
		}
	}

}
