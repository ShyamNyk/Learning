package com.shyam.learning.java8.collectionNewFeatures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionNewFeatures {

	public static void main(String[] args) {

		// Sorting Map directly with Comparators
		// As we know Map is in order, it is a lot of struggle to get it sorted. Now Map
		// interface added default methods which gives you comparators for different
		// styles like
		// comparingByKey, comparingByValue
		Map<String, String> map1 = new HashMap<>();
		map1.put("C", "c");
		map1.put("B", "b");
		map1.put("Z", "z");
		List<Map.Entry<String, String>> sortedByValue = map1.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toList());
		sortedByValue.forEach(System.out::println);
		System.out.println();

		// Iterate over map easily with forEach.
		// Now it is super easy to iterate over map just like List
		map1.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
		System.out.println();

		// Get rid off ugly if-else condition, use getOrDefault method.
		// Legacy code for checking containsKey got moved to default method
		// getOrDefault. This method returns the value to which the specified key is
		// mapped, otherwise returns the given defaultValue if this map contains no
		// mapping for the key.
		String val = map1.getOrDefault("B", "Nah!");
		String val1 = map1.getOrDefault("D", "Nah!");
		System.out.println(val);
		System.out.println(val1);

		// Replace and Remove utilities.
		// New utility default methods have been added now. replaceAll Can replace all
		// the values in a single attempt
		map1.replaceAll((k, v) -> "x"); // values is "x" for all keys.
		map1.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

		// Do not override keys accidentally use putIfAbsent
		map1.putIfAbsent("B", "x");
		System.out.println(map1.get("B"));

		// operate directly on values.
		// Gone are the days when you needed to get the value for specific keys, process
		// it and put them back. Now you can directly modify with help of compute
		// method.
		Map<String, String> map = new HashMap<>();
		map.put("C", "c");
		map.put("B", "b");
		map.compute("B", (k, v) -> v.concat(" - new "));
		System.out.println(map.get("B")); // prints "b - new"

		// To merge maps use merge method.
		Map<String, String> map2 = new HashMap<>();
		map2.put("C", "c");
		map2.put("B", "b");
		map2.merge("B", "NEW", (v1, v2) -> v1 + v2);
		System.out.println(map2.get("B")); // prints bNEW

	}

}
