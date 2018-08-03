package in.co.cg.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import in.co.cg.collectionbaisc.Students;

public class Test6 {

	public static void main(String[] args) {

		Map<Students, String> hm = new HashMap<>(); // HashMap with School class
		hm.put(new Students("Rohit"), "Apple");
		hm.put(new Students("Rishi"), "Oranges");
		hm.put(new Students("Rishav"), "Banana");

		Students std = new Students("Rohit");
		System.out.println(hm.get(std));

		Set<Entry<Students, String>> set = hm.entrySet();
		set.stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));

		Set<Students> keySet = hm.keySet();
		System.out.println("Keys are:  \n" + keySet);
	}

}
