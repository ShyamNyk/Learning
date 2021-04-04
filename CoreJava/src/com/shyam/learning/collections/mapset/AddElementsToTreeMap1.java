package com.shyam.learning.collections.mapset;

// If you want to add a custom object as key to a TreeMap, it should be of comparable  type

import java.util.Map;
import java.util.TreeMap;

class Student implements Comparable<Student> {

	int id;
	String name;
	String address;

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Student o) {
		if (o.getId() == id)
			return 0;
		else if (o.getId() > id)
			return 1;
		else
			return -1;
	}

}

public class AddElementsToTreeMap1 {

	public static void main(String args[]) {

		Map<Student, String> map = new TreeMap<Student, String>();

		Student e1 = new Student(1, "Shyam", "Odisha");
		Student e2 = new Student(3, "Shya3", "Odisha3");
		Student e3 = new Student(2, "Shyam2", "Odisha2");
		Student e4 = new Student(11, "Shyamsfsd", "Odishasdf");
		map.put(e1, "value 1");
		map.put(e2, "value 2");
		map.put(e3, "value 3");
		map.put(e4, "value 4");

		for (Map.Entry<Student, String> tm : map.entrySet()) {
			System.out.println(tm.getKey().getId() + " === " + tm.getValue());
		}

	}

}
