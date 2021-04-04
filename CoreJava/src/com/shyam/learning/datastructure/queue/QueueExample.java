package com.shyam.learning.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		// Since Queue is an interface, objects cannot be created of the type queue.
		// We always need a class which extends this list in order to create an object
		Queue<Integer> q = new LinkedList<>();

		// Adds elements {0, 1, 2, 3, 4} to
		// the queue
		for (int i = 0; i < 5; i++)
			q.add(i);

		// Display contents of the queue.
		System.out.println("Elements of queue " + q);

		// To remove the head of queue.
		int removedele = q.remove();
		System.out.println("removed element-" + removedele);

		System.out.println(q);

		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue-" + head);

		// Rest all methods of collection
		// interface like size and contains
		// can be used with this
		// implementation.
		int size = q.size();
		System.out.println("Size of queue-" + size);
		
		// Printing the top element and removing it 
        // from the LinkedList container 
        System.out.println(q.poll()); 
        
		System.out.println("Size of queue-" + size);
	}
}

// Characteristics of a Queue: The following are the characteristics of the queue:
// The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. It follows FIFO concept.
// The Java Queue supports all methods of Collection interface including insertion, deletion etc.
// LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
// If any null operation is performed on BlockingQueues, NullPointerException is thrown.
// The Queues which are available in java.util package are Unbounded Queues.
// The Queues which are available in java.util.concurrent package are the Bounded Queues.
// All Queues except the Deques supports insertion and removal at the tail and head of the queue respectively. The Deques support element insertion and removal at both ends.
