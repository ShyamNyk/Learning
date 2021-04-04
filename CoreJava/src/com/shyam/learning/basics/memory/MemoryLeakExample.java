package com.shyam.learning.basics.memory;

import java.util.Vector;

public class MemoryLeakExample {
	public static void main(String[] args) {
		Vector v1 = new Vector(314567);
		Vector v2 = new Vector(876543987);
		System.out.println("There is no memory leak in this program.");
	}
}


/*
 * When we run the above program, it shows java.lang.OutOfMemoryError. Because
 * it does not occupy space in the memory. If the program prints the statement
 * There is no memory leak in this program, it ensures that the program runs
 * successfully.
 */