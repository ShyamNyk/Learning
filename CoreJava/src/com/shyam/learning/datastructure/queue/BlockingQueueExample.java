package com.shyam.learning.datastructure.queue;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*Java provides several BlockingQueue implementations such as LinkedBlockingQueue, 
ArrayBlockingQueue, PriorityBlockingQueue, SynchronousQueue, etc. 
Java BlockingQueue interface implementations are thread-safe*/

public class BlockingQueueExample {

	public static void main(String args[]) throws InterruptedException {

		// define capacity of ArrayBlockingQueue
		int capacity = 5;
		// create object of ArrayBlockingQueue
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(capacity);

		// Add elements to ArrayBlockingQueue using put
		queue.put("StarWars");
		queue.put("SuperMan");
		queue.put("Flash");
		queue.put("BatMan");
		queue.put("Avengers");

		// print Queue
		System.out.println("queue contains " + queue);

		// remove some elements
		queue.remove();
		queue.remove();

		// print Queue
		System.out.println("queue contains " + queue);

		// Add elements to ArrayBlockingQueue
		// using put method
		queue.put("CaptainAmerica");
		queue.put("Thor");

		System.out.println("queue contains " + queue);

		// Using element() to retrieve the head of the deque
		String head = queue.element();
		System.out.println("The head of lbdq: " + head);

		// To check if the deque contains 22
		if (queue.contains("Thor"))
			System.out.println("The LinkedBlockingDeque, lbdq contains 22");
		else
			System.out.println("No such element exists");

		
	}

}
