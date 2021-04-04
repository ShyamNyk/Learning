package com.shyam.learning.basics.immutability;

import java.util.ArrayList;
import java.util.List;

// Can we add elements to a list that is declared final
// yes, we can add but we can't change the reference

public class Tryme {

	public static void main(String[] args) {

		final List list;
		list = new ArrayList<String>();
		list.add("shyam");
		list.add("Ram");
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		// The below line will give error
		// list = new ArrayList<String>();

	}

}
