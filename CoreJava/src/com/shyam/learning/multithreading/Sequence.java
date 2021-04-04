package com.shyam.learning.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Execute threads in a sequential manner using Executor Framework
public class Sequence {
	int valve = 1;

	public static void main(String[] args) {
		Sequence s = new Sequence();
		ExecutorService es = Executors.newFixedThreadPool(3);

		List<Runnable> rList = new ArrayList<Runnable>();
		rList.add(new A(s));
		rList.add(new B(s));
		rList.add(new C(s));

		for (int i = 0; i < rList.size(); i++) {
			es.submit(rList.get(i));
		}
		es.shutdown();

	}
}

class A implements Runnable {
	Sequence s;

	A(Sequence s) {
		this.s = s;
	}

	public void run() {
		synchronized (s) {
			for (int i = 0; i < 10; i++) {
				while (s.valve != 1) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("A");
				s.valve = 2;
				s.notifyAll();
			}
		}
	}
}

class B implements Runnable {
	Sequence s;

	B(Sequence s) {
		this.s = s;
	}

	public void run() {
		synchronized (s) {
			for (int i = 0; i < 10; i++) {
				while (s.valve != 2) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("B");
				s.valve = 3;
				s.notifyAll();
			}
		}
	}
}

class C implements Runnable {
	Sequence s;

	C(Sequence s) {
		this.s = s;
	}

	public void run() {
		synchronized (s) {
			for (int i = 0; i < 10; i++) {
				while (s.valve != 3) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("C");
				s.valve = 1;
				s.notifyAll();
			}
		}
	}
}