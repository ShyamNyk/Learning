package com.shyam.learning.multithreading;

public class LockExmaple {

	public static void main(String args[]) {
		MyCounter counter = new MyCounter();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					counter.add(1);
					counter.print("Thread 1");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					counter.add(10);
					counter.print("Thread 2");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

	}
}

class MyCounter {

	private int count = 0;

	// A synchronized instance method in Java is synchronized on the instance (object) owning the method
	// If more than one instance exist, then one thread at a time can execute inside a synchronized instance method per instance. One thread per instance
	public synchronized void add(int value) throws InterruptedException {
		this.count += value;
		System.out.println(count);
		Thread.sleep(1000);
	}

	public static synchronized void print(String str) throws InterruptedException {
		System.out.println(str);
		//Thread.sleep(1000);
	}

}
