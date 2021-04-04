package com.shyam.learning.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class IteratorVsEnumeration {
	public static void main(String args[]) {
		List list = new ArrayList(Arrays.asList(new String[] { "Apple", "Cat", "Dog", "Rat" }));
		Vector v = new Vector(list);
		delete(v, "Dog");
	}

	private static void delete(Vector v, String name) {
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			String s = (String) e.nextElement();
			if (s.equals(name)) {
				v.remove(name);
			}
		}
		// Display the names
		System.out.println("The names are:");
		e = v.elements();
		while (e.hasMoreElements()) {
			// Prints elements
			System.out.println(e.nextElement());
		}
	}
}


//	Iterator	      										Enumeration
// - Both read and reomove									- ReadOnly
// - Can be used with any class of collection framwork 		- Only with legacy class like Vector and HashTable
// - FailFast												- FailSafe - does not throw concurrent modification exception
// - It has following methods −								- hasMoreElements()
// hasNext()												- nextElement()
// next()
// remove()