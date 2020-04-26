package com.shyam.learning.basics.operators;

public class DemoShiftOperator {

	public static void main(String[] args) {

		int x = 10;

		System.out.println("Binary form of " + x + " :" + Integer.toBinaryString(x));
		System.out.println("Left shift for " + x + " :" + (x << 1));
		System.out.println("Right shift for " + x + " :" + (x >> 1));
		System.out.println("Unsigned right shift " + x + " :" + (x >>> 1));

		System.out.println();
		x = -10;

		// -ve number is nothing but the 2's complement of the +ve number
		System.out.println("Binary form of " + x + " :" + Integer.toBinaryString(x));
		System.out.println("Left shift for " + x + " :" + (x << 1));
		System.out.println("Right shift for " + x + " :" + (x >> 1));
		// The Unsigned right shift operator (>>> N) shifts bits to the right by N
		// positions, discarding the sign bit(leftmost bit) and padding the N left-most
		// bits with 0's.
		System.out.println("Unsigned right shift " + x + " :" + (x >>> 1));

		// The right shift arithmetic operator (>> N) also shifts bits to the right by N
		// positions, but preserves the sign bit and pads the N left-most bits with 1's.
		// For example:
	}

}
