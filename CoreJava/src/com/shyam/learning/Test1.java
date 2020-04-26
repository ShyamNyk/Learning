package com.shyam.learning;

public class Test1 {

	public static void main(String args[]) {
		
		System.out.println(new Car().equals(new Car()));
		System.out.println(new Car() == (new Car()));
		
		System.out.println(new Test().equals(new Test1()));
		//System.out.println(new Test() == (new Test1()));
		 System.out.println(2.0 % 0); 

	}

}

class Car{
	private int model = 5;
}
