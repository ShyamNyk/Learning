package com.shyam.learning.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {

	public static void main(String[] args) {

		immutableList1();
		immutableList2();

	}

	private static void immutableList2() {
		
		// Java 9 feature
		// List<String> list = List.of("Java", "Kotlin", "Groovy");

		// System.out.println(list);

		// Using guava:
		// import java.util.*;
		// import com.google.common.collect.ImmutableList;
		// ImmutableList<String> iList = ImmutableList.copyOf(list);

	}

	// Collections.unmodifiableList creates a wrapper around the same existing List
	// such that the wrapper cannot be used to modify it.
	// However we can still change original List.

	private static void immutableList1() {
		List<String> list = new ArrayList<>();
		list.add("Geeks");

		// Create ImmutableList from List using copyOf()
		List<String> iList = Collections.unmodifiableList(list);

		// iList.add("shyam"); // This will throw unsupportedOperationException

		// We change List and the changes reflect in iList.
		list.add("For");
		list.add("Geeks");

		System.out.println(iList);

	}

}
