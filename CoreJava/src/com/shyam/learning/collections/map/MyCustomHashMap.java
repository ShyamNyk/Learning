package com.shyam.learning.collections.map;

/**
 * This is an attempt to come up with my own hash data structure. This
 * illustration does not cover all the corner cases of actual hashmap but it
 * gives a good understanding on how we can come up with our own hash
 * implementations
 *
 */

public class MyCustomHashMap<K, V> {

	private static final int DEFAULT_CAPACITY = 16;
	private static final int LOAD_FACTOR = 16;
	private int size;
	private EntryObj array[] = new EntryObj[DEFAULT_CAPACITY];

	/**
	 * * REFERENCE: JAVA SOURCE CODE *
	 * 
	 * Applies a supplemental hash function to a given hashCode, which defends
	 * against poor quality hash functions. This is critical because HashMap uses
	 * power-of-two length hash arrays, that otherwise encounter collisions for
	 * hashCodes that do not differ in lower bits. Note: Null keys always map to
	 * hash 0, thus index 0.
	 */
	private int getSupplementalHash(int h) {
		// This function ensures that hashCodes that differ only by
		// constant multiples at each bit position have a bounded
		// number of collisions (approximately 8 at default load factor).
		h ^= (h >>> 20) ^ (h >>> 12);
		return h ^ (h >>> 7) ^ (h >>> 4);
	}

	/**
	 * It makes sure the index number falls within the size of the hashmap
	 * 
	 * @param hash
	 * @return returns index for hashcode hash
	 */
	private int getindex(int hash) {
		return hash & (DEFAULT_CAPACITY - 1);
	}
	
	/**
	 * Associates the specified value with the specified key in this map. If the map
	 * previously contained a mapping for the key, the old value is replaced.
	 */
	public void put(K key, V value) {
		// get the hashcode and regenerate it to be optimum
		int userHash = key.hashCode();
		int hash = getSupplementalHash(userHash);

		// compute the index number (0-15 based on our default size)
		// this always results in a number between 0-15
		int index = getindex(hash);
		// Entry existingElement = array[index];

		for (EntryObj existingElement = array[index]; existingElement != null; existingElement = existingElement.next) {

			if (existingElement.key.equals(key)) {
				System.out.println("duplicate key value pair, replacing existing key " + key + ", with value " + value);
				existingElement.value = value;
				return;
			} else {
				System.out.println("Collision detected for key " + key + ", adding element to the existing index");
			}
		}

		//
		System.out.println("Adding key:" + key + ", value:" + value + " to the list");
		EntryObj obj = new EntryObj(key, value);
		obj.next = array[index];
		array[index] = obj;
		size++;
	}

	// Return size
	public int size() {
		return size;
	}

	/**
	 * Returns the entry associated with the specified key in the HashMap. Returns
	 * null if the HashMap contains no mapping for the key.
	 */
	public V get(K key) {
		// get the hashcode and regenerate it to be optimum
		int hash = getSupplementalHash(key.hashCode());

		// compute the index number (0-15 based on our default size)
		// this always results in a number between 0-15
		int index = getindex(hash);

		// get the element at the above index if it exists
		EntryObj existingElement = array[index];

		// if index is found then traverse through the linked list and
		// see if element is present
		while (existingElement != null) {
			System.out.println("Traversing the list inside the index for the key " + existingElement.getKey());
			if (existingElement.key.equals(key)) {
				return (V)existingElement.getValue();
			}
			existingElement = existingElement.next;
		}

		// if nothing is found then return null
		return null;
	}

	// for testing our own map
	public static void main(String[] args) {
		MyCustomHashMap hm = new MyCustomHashMap();

		

		hm.put(2, "shyam");
		hm.put(3, "Shyam3");
		hm.put(2, "Shyam2");
		hm.put(12, "Shyam12");
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(12));
		System.out.println("Size of the map : "+hm.size);

		//int val = (int)hm.get(2);

	}

	/**
	 * User defined map data structure with key and value.
	 * 
	 * This is also used as linked list in case multiple key-value pairs lead to the
	 * same index with same hashcodes and different keys (collisions) using the
	 * pointer 'next'.
	 */
	class EntryObj<K, V> {
		private final K key;
		private V value;
		EntryObj next;

		EntryObj(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}
	}
}
