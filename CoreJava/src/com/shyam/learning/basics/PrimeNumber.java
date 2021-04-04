package com.shyam.learning.basics;

/*Prime number is a number that is greater than 1 and divided by 1 or itself only.
In other words,prime numbers can't be divided by other numbers than itself or 1. 
Note: 0 and 1 are not prime numbers. 
The 2 is the only even prime number because all the other even numbers can be divided by 2*/

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Check if the given number is prime or not");
		int n = 5;
		System.out.println("Number to be checked : " + n);
		if (checkIfPrime(n))
			System.out.println(n + " is a Prime Number");
		else
			System.out.println(n + " is not a Prime Number");

		System.out.println();
		System.out.println("Print prime numbers within a range");
		int range = 10;
		System.out.println("Given range : " + range);
		printPrimeNumbers(range);

		System.out.println();
		System.out.println();
		n = 10;
		System.out.println("Print first " + n + " prime numbers");
		printFirstnPrimeNumbers(n);

	}

	public static boolean checkIfPrime(int n) {

		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = n / 2; i > 1; i--) {

			int rem = n % i;
			if (rem == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void printPrimeNumbers(int range) {
		System.out.print("Prime numbers : ");
		for (int i = 2; i <= range; i++) {
			if (checkIfPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void printFirstnPrimeNumbers(int n) {
		System.out.print("Prime numbers : ");
		int count = 0;
		int i = 2;
		while (count != n) {
			if (checkIfPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
	}
}
