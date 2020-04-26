package com.shyam.learning.basics;

// Swap two numbers without using a third variable
public class SwapTwoNumbers {

	public static void main(String[] args) {

		int x = 13;
		int y = 41;
		System.out.println("before swapping numbers: " + x + " " + y);
		/* Swapping */
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping: " + x + "  " + y);
	}
}
