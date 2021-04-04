package com.shyam.learning.collections.mapset;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithCustomObjectAsKey {

	public static void main(String args[]) {
		Employee e1 = new Employee(1, "Odisha");
		Employee e2 = new Employee(11, "Odisha");
		Employee e3 = new Employee(22, "Odisha22");
		System.out.println(e1.hashCode());
		int index = e1.hashCode() & 15;
		System.out.println(index);

		int index2 = e2.hashCode() & 15;
		System.out.println(e2.hashCode());
		System.out.println(index2);

		Map<Employee, String> hm = new HashMap<Employee, String>();
		hm.put(e1, "shyam");
		hm.put(e2, "Ram");
		hm.put(e3, "New value");
		
		e2.setAddress("Odisha");
		e2.setId(1);
		System.out.println(e2.hashCode());
		//hm.put(e1, "shyamsdfd");
		for (Map.Entry<Employee, String> entry : hm.entrySet()) {
			System.out.println("Key = " + entry.getKey().address + ", Value = " + entry.getValue());
		}
		System.out.println(hm.get(e2));
		System.out.println("Size of the hashmap : " + hm.size());
	}
}

class Employee {

	int id;
	String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee(int id, String address) {
		super();
		this.id = id;
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
}

//In case two objects are equal
//If equals method is not overridden, then it would contain two elements.
//If equals method is overridden  but hashcode method is not overidden, then it would contain two element.
//If nothing is overriden, then also it would contain two elements
//bcs Object class provided default hashcode and equals method

/*
 * Now can you see why if two objects are considered equal, their hashcodes must
 * also be equal? Otherwise, you'd never be able to find the object since the
 * default hashcode method in class Object virtually always comes up with a
 * unique number for each object, even if the equals() method is overridden in
 * such a way that two or more objects are considered equal. It doesn't matter
 * how equal the objects are if their hashcodes don't reflect that. So one more
 * time: If two objects are equal, their hashcodes must be equal as well.
 */

/*
 * if you only override the hash-code method nothing happens, because it always
 * returns a new hashCode for each object as an Object class. equals() : If you
 * only override the equals method, if a.equals(b) is true it means the hashCode
 * of a and b must be the same but that does not happen since you did not
 * override the hashCode method. Note : hashCode() method of Object class always
 * returns a new hashCode for each object. So when you need to use your object
 * in the hashing based collection, you must override both equals() and
 * hashCode().
 */

/*
 * The default implementation of Object's equals() is
 * 
 * public boolean equals(Object obj) { return (this == obj); }
 */

/*
 * The default implementation of hashCode method Object.hashcode() is a native
 * method. 
 * public native int hashCode();
 * That means it's implemented in platform specific code and is exposed as a native method. 
 * code for the same will be a compiled code and not available within JDK
 */
