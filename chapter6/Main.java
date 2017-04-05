package chapter6;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端(浅拷贝)
 * @author DN
 *
 */
public class Main {

	public static void main(String[] args) {
		List<String> aa = new ArrayList<String>();
		aa.add("a");
		Prototype prototype = new Prototype("aa", 11, aa);
		
		Prototype newPrototype = prototype.clone();
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
