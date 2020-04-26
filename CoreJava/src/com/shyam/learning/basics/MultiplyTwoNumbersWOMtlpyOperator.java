package com.shyam.learning.basics;

public class MultiplyTwoNumbersWOMtlpyOperator {

	public static void main(String[] args) {

		int x = 11;
		int y = 10;
		System.out.println("Given Numbers " + x + " " + y);
		System.out.println("Result Using Recursion = " + multiply1(x, y));
		System.out.println("Result Using For Loop = " + multiply2(x, y));
		System.out.println("Result Using shif operator = " + russianPeasant(x, y));


	}

	// This is using recursion
	// Time Complexity: O(y) where y is the second argument to function multiply().
	static int multiply1(int x, int y) {
		/* 0 multiplied with anything gives 0 */
		if (y == 0)
			return 0;
		/* Add x one by one */
		if (y > 0)
			return (x + multiply1(x, y - 1));
		/* the case where y is negative */
		if (y < 0)
			return -multiply1(x, -y);
		return -1;
	}

	// This is using For Loop
	static int multiply2(int x, int y) {
		int res = 0;
		if (y > 0) {
			for (int i = 0; i < y; i++) {
				res = res + x;
			}
		} else {
			for (int i = y; i < 0; i++) {
				res = res + x;
			}
		}

		return res;
	}

	// Using bitwise shift operator
	static int russianPeasant(int a, int b) {
		// initialize result
		int res = 0;

		// While second number doesn't become 1
		while (b > 0) {
			// If second number becomes odd,
			// add the first number to result
			if ((b & 1) != 0)
				res = res + a;

			// Double the first number
			// and halve the second number
			a = a << 1;
			b = b >> 1;
		}
		return res;
	}
}
