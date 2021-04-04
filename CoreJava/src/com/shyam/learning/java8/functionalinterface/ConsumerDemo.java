package com.shyam.learning.java8.functionalinterface;

import java.util.function.Consumer;

// Consumer<T> is an in-built functional interface Introduced in JAva 8
// It can be used in all contexts where an object needs to be consumed i.e taken as input
// and some operation needs to be performed on the object without returning any result
// void accept (T t)
// Consumer is used inside ForEach method

public class ConsumerDemo implements Consumer {

	@Override
	public void accept(Object t) {
		System.out.println("Printing : " + t);
	}
	public static void main(String args[]) {
		Consumer consumer = new Consumer() {
			public void accept(Object t) {
				System.out.println("Printing : " + t);
			}
		};
		consumer.accept(5);
	}

}
