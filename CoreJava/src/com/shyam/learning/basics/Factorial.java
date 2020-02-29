package com.shyam.learning.basics;

public class Factorial {

	public static void main(String args[]) {

		int n = 1;
		System.out.println("Give number : " + n);
		System.out.println("Factorial of the number WithOut Recursion: " + factorialWithOutRecursion(n));
		factorialWithOutRecursion(n);
		System.out.println("Factorial of the number With    Recursion: " + factorialWithRecursion(n));
	}

	public static int factorialWithOutRecursion(int n) {

		int fact = 1;
		for (int i = n; i > 0; i--) {
			fact = fact * i;
		}
		return fact;

	}

	public static int factorialWithRecursion(int n) {

		if (n == 0) {
			return 1;
		} else {
			return n * factorialWithRecursion(n - 1);
		}

	}

}
