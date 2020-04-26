package com.shyam.learning.designpattern.creational.single;

//Lazy initialization with Double check locking: In this mechanism, we overcome the overhead problem of synchronized code. In this method, getInstance is not synchronized but the block which creates instance is synchronized so that minimum number of threads have to wait and that’s only for first time.

// Java code to explain double check locking 
public class SingleTone5 {
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static SingleTone5 obj;

	private SingleTone5() {
		// private constructor
	}

	public static SingleTone5 getInstance() {
		if (obj == null) {
			// synchronized block to remove overhead
			synchronized (SingleTone5.class) {
				if (obj == null) {
					// if instance is null, initialize
					obj = new SingleTone5();
				}

			}
		}
		return obj;
	}
}

//Pros:
//Lazy initialization is possible.
//It is also thread safe.
//Performance overhead gets reduced because of synchronized keyword.
//Cons:
//First time, it can affect performance.
//As cons. of double check locking method is bearable so it can be used for high performance multi-threaded applications.
