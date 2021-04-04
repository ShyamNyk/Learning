package com.shyam.learning.multithreading;

//You have thread T1, T2, and T3, how will you ensure that thread T2 run after T1 and thread T3 run after T2?

public class ExecuteThreadsInOrderUsingJoin {
	
	public static void main(String args[]) {
		Thread t1 = new Thread(new MyThread1());
		t1.setName("Thread 1");
        Thread t2 = new Thread(new MyThread1());
        t2.setName("Thread 2");
        Thread t3 = new Thread(new MyThread1());
        t3.setName("Thread 3");

        t1.start();
        try{
        	t1.join();
        }catch (Exception e){

        }
        t2.start();
        try{
            t2.join();
        }catch (Exception e){

        }
        t3.start();
        try{
            t3.join();
        }catch (Exception e){

        }	
	}
}

class MyThread1 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
