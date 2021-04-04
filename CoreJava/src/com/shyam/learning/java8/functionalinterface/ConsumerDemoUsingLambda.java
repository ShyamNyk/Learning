package com.shyam.learning.java8.functionalinterface;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

// Consumer<T> is an in-built functional interface Introduced in JAva 8
// It can be used in all contexts where an object needs to be consumed i.e taken as input
// and some operation needs to be performed on the object without returning any result
// void accept (T t)
//

public class ConsumerDemoUsingLambda {

	public static void main(String args[]) {

		// Consumer consumer = new Consumer() {
		// public void accept(Object t) {
		// System.out.println("Printing : " + t);
		// }
		// };

		Consumer consumer = (t) -> System.out.println("Printing : " + t);

		//consumer.accept(5);

		// stream forEach method always accepts the consumer functional interface
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		 list.stream().forEach(consumer);
		// instead of passing the consumer reference, we can pass the lambda expression
		// directly
		//list.stream().forEach((t) -> System.out.println("Printing : " + t));

	}

}
