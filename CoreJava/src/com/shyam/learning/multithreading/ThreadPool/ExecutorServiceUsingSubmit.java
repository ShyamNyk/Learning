package com.shyam.learning.multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceUsingSubmit {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.submit(new Runnable() {

			@Override
			public void run() {
				System.out.println("ExecutorService");

			}
		});
	}
}