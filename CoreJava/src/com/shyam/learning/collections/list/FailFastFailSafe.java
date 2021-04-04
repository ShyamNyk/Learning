package com.shyam.learning.collections.list;

/*Fail-Fast iterators immediately throw ConcurrentModificationException if 
there is structural modification of the collection. Structural modification 
means adding, removing any element from collection while a thread is iterating 
over that collection. Iterator on ArrayList, HashMap classes are some examples 
of fail-fast Iterator.*/

/*Fail-Safe iterators don’t throw any exceptions if a collection is structurally 
modified while iterating over it. This is because, they operate on the clone 
of the collection, not on the original collection and that’s why they are 
called fail-safe iterators. Iterator on CopyOnWriteArrayList, ConcurrentHashMap 
classes are examples of fail-safe Iterator.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {

	public static void main(String args[]) {

		List<String> list = new ArrayList<String>();
		list.add("shyam1");
		list.add("shyam2");
		list.add("shyam3");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			// adding an element to list will throw exception
			list.add("shyam3");
		}

		// Fail safe iterator
		CopyOnWriteArrayList<Integer> list1 = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
		Iterator itr1 = list.iterator();
		while (itr1.hasNext()) {
			Integer no = (Integer) itr1.next();
			System.out.println(no);
			if (no == 8)

				// This will not print,
				// hence it has created separate copy
				list1.add(14);
		}

		// Example of Fail-Safe Iterator which does not create separate copy
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);

		// Getting an Iterator from map
		Iterator it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + map.get(key));

			// This will reflect in iterator.
			// Hence, it has not created separate copy
			map.put("SEVEN", 7);
		}
	}
}

/*
 * Important points of fail-fast iterators :
 * 
 * These iterators throw ConcurrentModificationException if a collection is
 * modified while iterating over it. They use original collection to traverse
 * over the elements of the collection. These iterators don’t require extra
 * memory. Ex : Iterators returned by ArrayList, Vector, HashMap.
 */

/*
 * Important points of fail-safe iterators : Fail-safe iterators allow
 * modifications of a collection while iterating over it. These iterators don’t
 * throw any Exception if a collection is modified while iterating over it. They
 * use copy of original collection to traverse over the elements of the
 * collection. These iterators require extra memory for cloning of collection.
 * Ex : ConcurrentHashMap, CopyOnWriteArrayList
 */
/*
 * How Fail Fast Iterator works ? To know whether the collection is structurally
 * modified or not, fail-fast iterators use an internal flag called modCount
 * which is updated each time a collection is modified.Fail-fast iterators
 * checks the modCount flag whenever it gets the next value (i.e. using next()
 * method), and if it finds that the modCount has been modified after this
 * iterator has been created, it throws ConcurrentModificationException.
 */

/*
 * If you remove an element via Iterator remove() method, exception will not be
 * thrown. However, in case of removing via a particular collection remove()
 * method, ConcurrentModificationException will be thrown
 */