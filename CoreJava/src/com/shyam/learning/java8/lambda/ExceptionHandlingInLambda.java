package com.shyam.learning.java8.lambda;

//A lambda expression in Java can throw an exception but 
//that exception must be compatible with those specified 
//in the throws clause of the functional interface method.
// It can be a same exception or subset 

interface IFuncInt {
	int func(int num1, int num2) throws Exception;
}

public class ExceptionHandlingInLambda {
	public static void main(String[] args) {
		IFuncInt funcInt = (num1, num2) -> {
			int result = num1 + num2;
			throw new Exception();
		};
		try {
			System.out.println("" + funcInt.func(6, 7));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
