package com.shyam.learning.designpattern.creational.factory;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String args[]) {

		System.out.println("Example of Factory Design Pattern");

		System.out.println("Enter the plan for which the bill needs to be generated");

		Scanner sc = new Scanner(System.in);
		String planType = sc.nextLine();

		System.out.println("Enter number of Units");
		int units = sc.nextInt();

		System.out.println("Bill for " + planType + " plan for " + units + " number of units =");
		
		Plan p = FactoryClass.getPlan("Domestic");
		
		p.getRate();
		p.calculateBill(units);
		
		
	}

}
