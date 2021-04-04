package com.shyam.learning.collections.mapset;

/*In the LinkedHashMap implementation, the LinkedHashMap.Entry class extends 
the HashMap.Entry class, by adding before and after fields. 
These fields are used to assemble the LinkedHashMap.Entry objects into an 
independent doubly-linked list that records the insertion order. 
So, in the LinkedHashMap class, the entry objects are in two distinct chains:
a singly linked hash chain that is accessed via the main hash array, and
a separate doubly linked list of all entries that is kept in entry insertion order*/

// https://www.javamadesoeasy.com/2015/02/linkedhashmap-custom-implementation.html

public class MyLinkedHashMap {

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;
		Entry<K, V> before, after; // For maintaining insertion order
		/*
		 * By using before and after - we keep track of newly added entry in
		 * LinkedHashMap, which helps us in maintaining insertion order.
		 */

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

}
