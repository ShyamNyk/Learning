package com.shyam.learning.multithreading;

import java.util.concurrent.Executors;

//The Java ExecutorService interface, java.util.concurrent.ExecutorService, 
//represents an asynchronous execution mechanism which is capable of executing tasks concurrently in the background

//The executor service creates and maintains a reusable pool of threads for executing submitted tasks. 

//The service also manages a queue, which is used when there are more tasks than the number of threads 
//in the pool and there is a need to queue up tasks until there is a free thread available to execute the task

//Java Thread pool represents a group of worker threads that are waiting for the job and reuse many times.
// In case of thread pool, a group of fixed size threads are created. A thread from the thread pool is pulled out and assigned a job by the service provider. After completion of the job, thread is contained in the thread pool again.
public class ExecutorService {

	public static void main(String[] args) {
		java.util.concurrent.ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.execute(new Runnable() {
			public void run() {
				System.out.println("Asynchronous task");
			}
		});
		executorService.shutdown();
	}
}
