package com.shyam.learning.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//There are generally five ways of iterating over a Map in Java

public class MapIteration {

	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<String, String>();

		// enter name/url pair
		hm.put("hm", "geeksforgeeks.org");
		hm.put("Practice", "practice.geeksforgeeks.org");
		hm.put("Code", "code.geeksforgeeks.org");
		hm.put("Quiz", "quiz.geeksforgeeks.org");

		// using for-each loop for iteration over Map.entrySet()
		System.out.println("First Approach");
		for (Map.Entry<String, String> entry : hm.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		System.out.println();

		// Iterating over keys or values using keySet() and values() methods
		System.out.println("Second Approach");
		for (String name : hm.keySet())
			System.out.println("key: " + name);
		// using values() for iteration over keys
		for (String url : hm.values())
			System.out.println("value: " + url);
		System.out.println();

		// Iterating using iterators over Map.Entry<K, V>
		System.out.println("Third Approach");
		Iterator<Map.Entry<String, String>> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		System.out.println();

		// Using forEach(action) method :
		// In Java 8, you can iterate a map using Map.forEach(action) method and using
		// lambda expression.
		// This technique is clean and fast.
		System.out.println("Fourth Approach");
		hm.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
		System.out.println();

		// Iterating over keys and searching for values (inefficient)
		System.out.println("Fifth Approach");
		for (String name : hm.keySet()) {
			// search for value
			String url = hm.get(name);
			System.out.println("Key = " + name + ", Value = " + url);
		}
		System.out.println();

		

		// Delete elements from Map while iteration
		System.out.println("Delete elements from Map while iterating");
		Iterator<Map.Entry<String,String>> iter = hm.entrySet().iterator();
		while (iter.hasNext()) {
		    Map.Entry<String,String> entry = iter.next();
		    if("Practice".equalsIgnoreCase(entry.getValue())){
		        iter.remove();
		    }
		}
		System.out.println();
		
		// With Java 1.8 and onwards you can do the above in just one line
		hm.entrySet().removeIf(entry -> !hm.containsKey("Practice"));
	}

}
