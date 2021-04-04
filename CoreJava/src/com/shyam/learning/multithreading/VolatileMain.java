package com.shyam.learning.multithreading;

// The volatile keyword does not cache the value of the variable and always read the variable from the main memory

// The volatile keyword can be used either with primitive type or objects.
// It cannot be used with classes or methods

public class VolatileMain {

	private final static int noOfThreads = 2;

	public static void main(String[] args) throws InterruptedException {
		VolatileData volatileData = new VolatileData(); // object of VolatileData class
		Thread[] threads = new Thread[noOfThreads]; // creating Thread array
		for (int i = 0; i < noOfThreads; ++i)
			threads[i] = new VolatileThread(volatileData);
		for (int i = 0; i < noOfThreads; ++i)
			threads[i].start(); // starts all reader threads
		for (int i = 0; i < noOfThreads; ++i)
			threads[i].join(); // wait for all threads
	}
}

class VolatileThread extends Thread {
	private final VolatileData data;

	public VolatileThread(VolatileData data) {
		this.data = data;
	}

	@Override
	public void run() {
		int oldValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);
		data.increaseCounter();
		int newValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);
	}
}

class VolatileData {
	private int counter = 0;

	public int getCounter() {
		return counter;
	}

	public void increaseCounter() {
		++counter; // increases the value of counter by 1
	}
}
