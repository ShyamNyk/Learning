package com.shyam.learning.multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

// The Java ExecutorService's execute() method takes in a runnable object and performs its task asynchronously
// After making the call to execute method, we call the shutdown method, 
// which blocks any other task to queue up in the executorService.

// ExecutorService executorService1=Executors.newSingleThreadExecutor(); //Creates //a ExecutorService object having a single thread.  

// ExecutorService executorService2=Executors.newFixedThreadPool(10); // Creates a //ExecutorService object having a pool of 10 threads.  

// ExecutorService executorService3=Executors.newScheduledThreadPool(10); //Creates a scheduled thread pool executor with 10 threads. In scheduled thread, we can schedule tasks of the threads. 

/*To assign a task to ExecutorService, we can use the following methods-

execute(Runnable task)
submit(Runnable task) / submit(Callable<T> task)
invokeAny(Collection<? extends Callable<T>> tasks)
invokeAll(Collection<? extends Callable<T>> tasks)*/

public class ExecutorServiceExample {

	public static void main(String args[]) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		//ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

		executorService.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("Execuote Service: ");

			}

		});

		executorService.shutdown();

	}

}
