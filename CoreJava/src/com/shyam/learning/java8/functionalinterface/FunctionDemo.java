package com.shyam.learning.java8.functionalinterface;

import java.util.function.Function;

// It takes one argument and returns the function result
// public interface Function<T, R>
// Map takes function as input
// The Function interface consists of the following 4 methods:
// 1. apply()
//Method name : R apply(T t)
//Parameters: This method takes in only one parameter t which is the function argument
//Returns: This method returns the function result which is of type R.
// 2. andThen()

public class FunctionDemo {

	public static void main(String args[]) {

		// Function which takes in a number
		// and returns half of it
		// Function<Integer, Double> half = a -> a / 2.0;
		Function<Integer, Double> function = new Function<Integer, Double>() {

			@Override
			public Double apply(Integer t) {
				// TODO Auto-generated method stub
				return t / 2.0;
			}

		};
		
		// Same can be written in a lambda expressoin 
		// Function<Integer, Double> function = t -> t / 2.0;

		// apply the function to get the result
		System.out.println(function.apply(10));
	}
}
