package com.shyam.learning.java8.lambda;

// A variable or parameter whose value is never changed after it is initialized is effectively final.
/*When a lambda expression uses an assigned local variable from its enclosing space there is an important restriction. A lambda expression may only use local variable whose value doesn't change. That restriction is referred as "variable capture" which is described as; lambda expression capture values, not variables.
The local variables that a lambda expression may use are known as "effectively final".
*/
@FunctionalInterface
interface IFunc {
	void display();
}

public class EffectivelyFinal {
	public static void main(String[] args) {
		int i = 7;
		// lambda expression that implements the display method
		// of the IFunc functional interface
		IFunc ifunc = () -> System.out.println("Value of i is " + i);
		// Calling the display method
		ifunc.display();
		

		// if we change the value of i, it will throw compile time error
		//IFunc ifunc1 = () -> System.out.println("Value of i is " + i++);
		// Calling the display method
		//ifunc.display();
	}
}

//Note: Final and Effective Final are similar(Their value don't change after assignment) but just that effective 
//Final variables are not declared with Keyword final.
/*
 * final
 * final int number; number = 23;
 */
/*
 * effective final
 * int number; number = 34;
 */
