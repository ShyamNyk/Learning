package com.shyam.learning;

import java.util.Arrays;

public class TestScenario {

	public static void main(String[] args) {
		System.out.println(fun1());
	}

	public static int fun1() {
		int a = 1;
		try {
			System.out.println(a / 0);
			a = 2;
		} catch (ArithmeticException e) {
			a = 3;
			return a;
		} finally {
			a = 4;

		}
		return a;
	}
}