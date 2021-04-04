//Number of occurrences of a digit in numbers from 0 to n

package com.shyam.learning.basics;

public class OccurenceOfADigit {

	public static void main(String args[]) {

		int digit = 9;
		int range = 100;
		System.out.println("Find the occurence of digit " + digit + " in the range of 0 to " + range);

		int count = 0;
		for (int i = digit; i <= range; i++) {
			count = count + numberOfDigitsInRange(digit, i);
		}
		System.out.println(count);
	}

	private static int numberOfDigitsInRange(int digit, int range) {

		int count = 0;
		while (range > 0) {
			if (range % 10 == digit)
				count++;

			range = range / 10;
		}
		return count;
	}

}

//Time Complexity:O(n)
