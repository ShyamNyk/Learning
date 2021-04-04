package com.shyam.learning.multithreading;

public class ParalellThreadsAlternativeOutput {
	
	static ParalellThreadsAlternativeOutput obj = new ParalellThreadsAlternativeOutput();

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				obj.print("Ping");
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				obj.print("   Pong");
			}
		});

		t1.start();
		t2.start();

	}

	public void print(String str) {
		while (true) {
			//synchronized (this) { // this also works
			synchronized (obj) {
				System.out.println(str);
				try {
					obj.notify();
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
