package com.shyam.learning.generics;

// A class that can refer to any type is known as a generic class. 
// Here, we are using the T type parameter to create the generic class of specific type.
public class GenericClassExample {

	public static void main(String args[]) {
		MyGen<Integer> m = new MyGen<Integer>();
		m.add(2);
		// m.add("vivek");//Compile time error
		System.out.println(m.get());
	}

}

/*
 * The T type indicates that it can refer to any type (like String, Integer, and
 * Employee). The type you specify for the class will be used to store and
 * retrieve the data.
 */
class MyGen<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

/*
 * Type Parameters The type parameters naming conventions are important to learn
 * generics thoroughly. The common type parameters are as follows:
 * 
 * T - Type 
 * E - Element 
 * K - Key 
 * N - Number 
 * V - Value
 */
