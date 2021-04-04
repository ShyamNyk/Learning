package com.shyam.learning.multithreading;

// A thread is automatically destroyed when the run() method has completed.

// Thread can be stopped in two ways
// 1) By using a Boolean flag
// 2) By using Thread.interrupt() method

public class KillingAThread1 {

	// static used here
	// because a non-static variable
	// cannot be referenced
	// from a static context

	// exit variable to stop both
	// the main and inside threads
	static boolean exit = false; // It can be declared as volatile to make it thread safe

	public static void main(String[] args) {

		System.out.println("started main thread..");

		// a thread inside main thread
		Thread t = new Thread() {
			public void run() {
				System.out.println("started inside thread..");

				// inside thread caches the value of exit,
				// so changes made to exit are not visible here
				while (!exit) // will run infinitely
				{
					System.out.println("Thread is running");
				}

				System.out.println("exiting inside thread..");
			}
		};
		
		t.start();
	    try { 
            Thread.sleep(500); 
        } 
        catch (InterruptedException e) { 
            System.out.println("Caught :" + e); 
        } 
  
        // so that we can stop the threads 
        exit = true; 
        System.out.println("exiting main thread.."); 

	}

}
