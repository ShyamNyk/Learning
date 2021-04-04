package com.shyam.learning.java8.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		
		
		//1. Creating stream from values
		System.out.println("Stream of Strings");
		Stream<String> stringStream = Stream.of("shyam","Ram","Priya");
		stringStream.forEach(System.out::println);

		// 2. Stream of integers
		System.out.println("Stream of Integers");
		Stream<Integer> integerStream = Stream.of(1,2,3,4);
		integerStream.forEach(System.out::println);
		
		// 3. Stream of finite integers
		System.out.println("Stream of finite Integers");
		IntStream intStream = IntStream.range(1,11);
		intStream.forEach(System.out::println);
		
		// 4. Getting stream of Array
		System.out.println("Getting stream from Array");
		IntStream numbers = Arrays.stream(new int[]{1,2,3,4,5});
		numbers.forEach(System.out::println);
		
		// 5.Stream of Collections
		// Create and populate a set of Strings
		Set<String> set = new HashSet<String>();
		set.add("shyam");set.add("Ram");
		System.out.println("Create a sequentail stream for the set");
		Stream<String> sequentialStream = set.stream();
		sequentialStream.forEach(System.out::println);
		System.out.println("Create a parallet Stram from the set");
		Stream<String> parallelStream = set.parallelStream();
		parallelStream.forEach(System.out::println);

		
	}

}
