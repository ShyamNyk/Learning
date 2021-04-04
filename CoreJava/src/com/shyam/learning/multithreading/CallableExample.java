package com.shyam.learning.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String args[]) throws InterruptedException, ExecutionException {
		java.util.concurrent.ExecutorService services = Executors.newSingleThreadExecutor();
		Future<?> future = services.submit(new Task());
		System.out.println("In Future Object" + future.get());
	}

}

class Task implements Callable {

	@Override
	public String call() throws Exception {
		System.out.println("In call");
		String name = "test";
		return name;
	}
}

//A Callable needs to implement call() method while a Runnable needs to implement run() method.
//A Callable can return a value but a Runnable cannot.
//A Callable can throw checked exception but a Runnable cannot.
//A Callable can be used with ExecutorService#invokeXXX(Collection<? extends Callable<T>> tasks) methods but a Runnable cannot be.
