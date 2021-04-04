package com.shyam.learning.basics;

// 0,1,1,2,3,5,8,13,21

public class FibonacciSeries {

	int prev = 0;
	int next = 1;
	int sum = 0;

	public static void main(String args[]) {
		int n = 10;
		System.out.println("Count : " + n);
		FibonacciSeries obj1 = new FibonacciSeries();
		obj1.fiboWithOutRecusrion(n);
		FibonacciSeries obj2 = new FibonacciSeries();
		obj2.fiboWithRecusrion(n);
	}

	// Fibonacci series without recursion
	public void fiboWithOutRecusrion(int n) {

		System.out.print("Fibonacci Series Without Recursion : " + prev + " " + next + " ");
		for (int i = 2; i <= n; i++) {
			sum = prev + next;
			prev = next;
			next = sum;
			System.out.print(sum + " ");
		}
	}

	// Fibonacci series with recursion
	public void fiboWithRecusrion(int n) {

		int prev = 0;
		int next = 1;
		int sum = 0;
		System.out.println();
		System.out.print("Fibonacci Series With    Recursion : " + prev + " " + next + " ");
		fiboSeries(n - 2);
	}

	public void fiboSeries(int n) {
		if (n >= 0) {
			sum = prev + next;
			prev = next;
			next = sum;
			System.out.print(sum + " ");
			n--;
			fiboSeries(n);
		}
	}
}
