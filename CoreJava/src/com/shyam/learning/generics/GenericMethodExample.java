package com.shyam.learning.generics;

/**
 * @author ssundarn
 *
 */

/*
 * Like the generic class, we can create a generic method that can accept any
 * type of arguments. Here, the scope of arguments is limited to the method
 * where it is declared
 */
public class GenericMethodExample {

	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A', 'T', 'P', 'O', 'I', 'N', 'T' };

		System.out.println("Printing Integer Array");
		printArray(intArray);

		System.out.println("Printing Character Array");
		printArray(charArray);
	}
}