package com.shyam.learning.problemSolving;

//Java program to check if a number is perfect
//square without finding the square root

public class CheckIfNumberIsPerfectSquare {

	static boolean isPerfectSquare(int n) {
		for (int i = 1; i * i <= n; i++) {

			if (i * i == n) {
				// if ((n % i == 0) && (n / i == i)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int n = 81;

		if (isPerfectSquare(n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}