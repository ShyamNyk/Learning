package com.shyam.learning.collections.mapset;

import java.util.HashMap;
import java.util.Map;

// What happens when we change the value inside a key after adding it to the hashMap
public class ChangeKeyValue {

	public static void main(String args[]) {

		Map<Employeee, String> map = new HashMap<Employeee, String>();

		Employeee e1 = new Employeee();
		e1.setId(1);
		e1.setName("xyz1");

		Employeee e2 = new Employeee();
		e2.setId(2);
		e2.setName("xyz2");

		map.put(e1, "shyam1");
		map.put(e2, "shyam2");

		System.out.println(map.get(e1));
		System.out.println(map.get(e2));
		System.out.println("after changing the value");

		//One scenario
		e2.setId(1);
		e2.setName("xyz1");

		System.out.println("Number of elements : "+map.size());

		System.out.println("Hash Codes :"+e1.hashCode()+" - "+e2.hashCode());
		System.out.println(e1 == e2);
		// Same hashcode does not mean that the two objects are equal
		System.out.println(e1.equals(e2));
		System.out.println(map.get(e1));
		System.out.println(map.get(e2));
		// What will happen if we remove the equals method overriding
		// What will happen if we remove the hashcode method overriding
		
		// Another Scenario
		System.out.println("another scenario");
		e2.setId(1);
		e2.setName("xyz4");

		System.out.println(map.size());
		System.out.println(map.get(e1));
		System.out.println(map.get(e2));
		System.out.println(e2.hashCode());
		
	
	}
}

class Employeee {

	int id;
	String name;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employeee other = (Employeee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
