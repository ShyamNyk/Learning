package com.shyam.learning.java8.streamapi;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPrintOddNumbers {

	public static void main(String args[]) {

		printFirstFiveRandomNumbers();
		printFirstFineOddNumbers();
		printOddNumbers();
		squareOfallNumbers();
	}

	// First five random numbers
	private static void printFirstFiveRandomNumbers() {
		System.out.println("First five random numbers");
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
	}

	// First five odd numbers
	private static void printFirstFineOddNumbers() {
		System.out.println("First five odd numbers");
		Stream.iterate(1L, n -> n + 2).limit(5).forEach(System.out::println);
		// The below is for even numbers
		//Stream.iterate(0L, n -> n + 2).limit(5).forEach(System.out::println);
	}

	// First five odd numbers
	private static void printOddNumbers() {
		System.out.println("Print unlimted odd numbers");
		Stream<Long> oddNumbersStream = Stream.iterate(1L, n -> n + 2);
		//oddNumbersStream.forEach(System.out::println);
	}
	
	// Print square of all the numbers in the array
	private static void squareOfallNumbers() {
		System.out.println("Square of all numbers");
		IntStream numberRange = IntStream.rangeClosed(1,5);
		numberRange.map(n->n*n).forEach(System.out::println);
	}
	
	

}
