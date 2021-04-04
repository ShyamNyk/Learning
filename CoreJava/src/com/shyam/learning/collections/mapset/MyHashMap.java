package com.shyam.learning.collections.mapset;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class MyEntry<K, V> {
	private final K key;
	private V value;

	public MyEntry(K key, V value) {
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

public class MyHashMap<K, V> {
	private int size;
	private int DEFAULT_CAPACITY = 16;
	@SuppressWarnings("unchecked")
	private MyEntry<K, V>[] values = new MyEntry[DEFAULT_CAPACITY];

	public V get(K key) {
		for (int i = 0; i < size; i++) {
			if (values[i] != null) {
				if (values[i].getKey().equals(key)) {
					return values[i].getValue();
				}
			}
		}
		return null;
	}

	public void put(K key, V value) {
		boolean insert = true;
		for (int i = 0; i < size; i++) {
			if (values[i].getKey().equals(key)) {
				values[i].setValue(value);
				insert = false;
			}
		}
		if (insert) {
			ensureCapa();
			values[size++] = new MyEntry<K, V>(key, value);
		}
	}

	private void ensureCapa() {
		if (size == values.length) {
			int newSize = values.length * 2;
			values = Arrays.copyOf(values, newSize);
		}
	}

	public int size() {
		return size;
	}

	public void remove(K key) {
		for (int i = 0; i < size; i++) {
			if (values[i].getKey().equals(key)) {
				values[i] = null;
				size--;
				condenseArray(i);
			}
		}
	}

	private void condenseArray(int start) {
		for (int i = start; i < size; i++) {
			values[i] = values[i + 1];
		}
	}

	public Set<K> keySet() {
		Set<K> set = new HashSet<K>();
		for (int i = 0; i < size; i++) {
			set.add(values[i].getKey());
		}
		return set;
	}

	public static void main(String args[]) {
		
		MyHashMap map = new MyHashMap();
		map.put("1", "Shyam1");
		map.put("2", "Shyam2");
		map.put("3", "Shyam3");
		map.put("4", "Shyam4");
		map.put("5", "Shyam5");
		map.put("6", "Shyam6");
		map.put("7", "Shyam7");
		map.put("8", "Shyam8");
		map.put("9", "Shyam9");
		map.put("10", "Shyam10");
		map.put("11", "Shyam11");
		map.put("12", "Shyam12");
		map.put("13", "Shyam13");
		map.put("14", "Shyam14");
		map.put("15", "Shyam15");
		map.put("16", "Shyam16");
		map.put("17", "Shyam17");

		System.out.println(map.get("1"));
		System.out.println(map.get("17"));
		System.out.println(map.size);


	}
}
