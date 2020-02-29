package com.shyam.learning.basics;

public class ReverseOfNumber {

	public static void main(String args[]) {
		System.out.println("Find the reverse of a numebr");
		int n = 8976;
		System.out.println("Given Number : " + n);
		System.out.println("Reverse of the number : " + reverseNumber(n));
	}

	public static int reverseNumber(int num) {

		int rem, reverse = 0;

		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			reverse = reverse * 10 + rem;
		}

		return reverse;

	}

}
