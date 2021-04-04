package com.shyam.learning.java8.functionalinterface;

import java.util.stream.Stream;

// T reduce (T identity, BinarOperator<T> accumulator)
// - Idenity is the initial value of Type T
// - Accumulator is a function for combining two values
// Map is used to transform the data
// Reduce is used to perform aggregate function


public class RedcueDemo {
	
	public static void main (String args[]) {
		
		Integer sumResult = Stream.of(2,4,69,1,3,7).reduce(0,(a,b)->a+b);
		System.out.println(sumResult);
		// Identity: 0 which is noting but initial value
		// Accumulator: (a,b)-> a+b function
		
		
		
	}

}
