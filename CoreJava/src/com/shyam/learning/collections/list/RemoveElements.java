package com.shyam.learning.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

/*An element can be removed from a Collection using the Iterator method remove(). 
This method removes the current element in the Collection. 
If the remove() method is not preceded by the next() method, 
then the exception IllegalStateException is thrown*/

public class RemoveElements {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Apple");
		aList.add("Mango");
		aList.add("Guava");
		aList.add("Orange");
		aList.add("Peach");
		System.out.println("The ArrayList elements are: ");
		for (String s : aList) {
			System.out.println(s);
		}
		/*
		 * If you remove an element via Iterator remove() method, exception will not be
		 * thrown. However, in case of removing via a particular collection remove()
		 * method, ConcurrentModificationException will be thrown
		 */

		Iterator i = aList.iterator();
		String str = "";
		while (i.hasNext()) {
			str = (String) i.next();
			if (str.equals("Orange")) {
				i.remove();
				System.out.println("\nThe element Orange is removed");
				break;
			}
		}
		System.out.println("\nThe ArrayList elements are: ");
		for (String s : aList) {
			System.out.println(s);
			if (s.equals("Mango")) {
				aList.remove("Mango");
				System.out.println("\nThe element Orange is removed");
				break;
			}
		}

		System.out.println(aList.size());
		for (String s : aList) {
			System.out.println(s);
		}
	}
}