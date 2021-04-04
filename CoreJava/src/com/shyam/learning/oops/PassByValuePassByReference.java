package com.shyam.learning.oops;

/*Pass by value- In this case value of the actual parameter is copied into memory (stack) used by the parameters of the method, 
so there are two independent variables with their own memory.

Pass by reference- In this case the memory address of the actual parameter is copied in the parameter of the method. 
Thus anytime method is using its parameter it is actually referencing the actual parameter.


*/

//https://www.netjstech.com/2015/04/java-pass-by-value-or-pass-by-reference.html

public class PassByValuePassByReference {

	void displayData(int i) {
		// value of the passed primitive variable changed
		i++;
		System.out.println("Value of i inside method " + i);
	}

	public static void main(String args[]) {
		PassByValuePassByReference a = new PassByValuePassByReference();
		int i = 5;
		// Sending variable i as param
		a.displayData(i);
		System.out.println("Value of i inside main " + i);
	}

}
