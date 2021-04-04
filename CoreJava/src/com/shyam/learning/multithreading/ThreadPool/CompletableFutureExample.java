package com.shyam.learning.multithreading.ThreadPool;

// CompletableFuture<T> class implements Future<T> interface in Java.
// CompletableFuture can be used as a Future that has explicitly completed. The Future interface doesn’t 
// provide a lot of features, we need to get the result of asynchronous computation using the get() method
// which is blocked, so there is no scope to run multiple dependent tasks in a non-blocking fashion 
// whereas CompleteFuture class can provide the functionality to chain multiple dependent tasks that run 
// asynchronously, so we can create a chain of tasks where the next task is triggered when the result of the 
// current task is available.

public class CompletableFutureExample {

	
	
}
