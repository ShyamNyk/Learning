package com.shyam.learning;

public class Test {

	public static void main(String args[]) {
		int num = 5;

		if (checkIfPrime(num)) {
			System.out.println(num + " Prime Number");
		} else {
			System.out.println(num + " Not a Prime Number");
		}
		
		System.out.println();
		
		printFirstNPrimeNumbers(10);

	}

	private static void printFirstNPrimeNumbers(int n) {
		
		int count = 0;
		int i=0;
		
		while (count < n) {
			
			if (checkIfPrime(i)) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		
		
	}

	private static boolean checkIfPrime(int num) {
		boolean status = true;
		for (int i = num / 2; i > 1; i--) {
			if (num % i == 0) {
				status = false;
				return status;
			}
		}
		return status;
	}
	
	
}
