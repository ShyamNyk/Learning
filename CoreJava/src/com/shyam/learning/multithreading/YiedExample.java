package com.shyam.learning.multithreading;


/*join() method
The join() method of a Thread instance can be used to “join” the start 
of a thread’s execution to the end of another thread’s execution 
so that a thread will not start running until another thread has ended. 
If join() is called on a Thread instance, the currently running thread 
will block until the Thread instance has finished executing.*/

/*yield() method
Theoretically, to ‘yield’ means to let go, to give up, to surrender. 
A yielding thread tells the virtual machine that it’s willing to let other 
threads be scheduled in its place. This indicates that it’s not doing 
something too critical. Note that it’s only a hint, though, and not 
guaranteed to have any effect at all.*/

public class YiedExample {
	public static void main(String[] args) {
		Thread producer = new Producer();
		Thread consumer = new Consumer();

		producer.setPriority(Thread.MIN_PRIORITY); // Min Priority
		consumer.setPriority(Thread.MAX_PRIORITY); // Max Priority

		producer.start();
		consumer.start();
	}
}

class Producer extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Producer : Produced Item " + i);
			Thread.yield();
		}
	}
}

class Consumer extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Consumer : Consumed Item " + i);
			Thread.yield();
		}
	}
}

// Difference between Yield and Wait
/*-Yield is a static method present in Thread class and wait is non-static in Object class
-Main difference between wait and yield in Java is that wait() is used for flow control and inter thread communication while yield is used just to relinquish CPU to offer an opportunity to another thread for running
*/

/*
 * yield() method pauses the currently executing thread temporarily for giving a
 * chance to the remaining waiting threads of the same priority or higher
 * priority to execute. If there is no waiting thread or all the waiting threads
 * have a lower priority then the same thread will continue its execution
 */


/*
 * join() If any executing thread t1 calls join() on t2 (i.e. t2.join())
 * immediately t1 will enter into waiting state until t2 completes its
 * execution.
 */

