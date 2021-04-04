package com.shyam.learning.java8.typeInference;

import java.util.ArrayList;
import java.util.List;

/*
- Java 8 provide improved version of Type inference
- Type inference is a feature of Java which provides ability to compiler to automatically 
detect unspecified data types of an arguments based on the contextual information
- The purpose of using type inference is to reduce unnecessary code verbosity.
*/

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		// Java earlier versions -  old approach(prior to Java 7)
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		showList(list1);
		
		// Java 7
		List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type
		list2.add(12);
		showList(list2);
		
		// Compiler infers type of ArrayList, in Java 8
		showList(new ArrayList<>());
		
		// In Java 8, type inference is improved so that we can call generic methods without specifying the type.
		addMore(new ArrayList<>(), 12, 12);
		
		typeInferenceInLamda();
	}

	public static void showList(List<Integer> list) {
		if (!list.isEmpty()) {
			list.forEach(System.out::println);
		} else
			System.out.println("list is empty");
	}
	
	static void addMore(List<Integer> list, int a, int b) {
		list.add(a);
		list.add(b);
		System.out.println(list);
	}
	
	// 
	private static void typeInferenceInLamda() {
		
		System.out.println("Type Inference in Lamda");
		List<Integer> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(101);
		numbers.add(102);
		numbers.add(103);
		// Java 8 versions
		numbers.forEach(element->System.out.println(element));
		
	}


}
