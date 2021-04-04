package com.shyam.learning.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/*The java.util.concurrent.atomic package provides very useful classes 
* that support lock-free and thread-safe programming on single variables.
* Among them, the AtomicInteger class is a wrapper class for an 
* int value that allows it to be updated atomically
*/

/*AtomicInteger supports atomic operations on underlying int variable. 
It have get and set methods that work like reads and writes on 
volatile variables.*/
// Volatile is used to mitigate the visibility issue
// Atomic integer is used to mitigate the syncronization issue in compound operations

public class AtomicIntegerClass {
	
	//This example creates an AtomicInteger with the initial value 0 .
	AtomicInteger atomicInteger1 = new AtomicInteger();
	
	//If you want to create an AtomicInteger with an initial value, you can do so like this:
	AtomicInteger atomicInteger2 = new AtomicInteger(123);
	
	// Getting value
	int theValue = atomicInteger2.get();

	AtomicInteger atomicInteger = new AtomicInteger(123);

	//atomicInteger.set(234);
}
