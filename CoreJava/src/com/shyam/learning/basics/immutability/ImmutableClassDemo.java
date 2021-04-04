package com.shyam.learning.basics.immutability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Immutable class is good for caching purpose because you don’t need to worry about the value changes.
Other benefit of immutable class is that it is inherently thread-safe,
so you don’t need to worry about thread safety in case of multi-threaded environment.
It is used as a Key in HashMap*/

//The class must be declared as final (So that child classes can’t be created)
//Data members in the class must be declared as private (So that direct access is not allowed)
//Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
//A parametrized constructor should initialize all the fields performing a deep copy (So that data members can’t be modified with object reference)
//Deep Copy of objects should be performed in the getter methods (To return a copy rather than returning the actual object reference)
//No setters (To not have the option to change the value of the instance variable)

public class ImmutableClassDemo {

	public static void main(String args[]) throws InterruptedException {
		String name = "shyam";
		int regNo = 23;
		Date date = new Date();
		Custom custom0 = new Custom(0, "Custom0");
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		List<String> list = new ArrayList<>();
		list.add("str1");
		list.add("str2");
		List<Custom> listCustom = new ArrayList<>();
		Custom custom1 = new Custom(1, "Custom1");
		Custom custom2 = new Custom(2, "Custom2");
		listCustom.add(custom1);
		listCustom.add(custom2);

		Map<String, String> map = new HashMap<>();
		map.put("Key1", "Value1");
		map.put("Key2", "Value2");

		// This object is not full proof immutable
		// MyImmutableClass immutableObject = new MyImmutableClass(name, regNo, date,
		// arr, custom0, list, listCustom, map);
		// The below one is full proof immutable
		MyImmutableClassFixed1 immutableObject = new MyImmutableClassFixed1(name, regNo, date, arr, custom0, list,
				listCustom, map);
		System.out.println("Before.................");
		System.out.println(immutableObject);

		Thread.sleep(2000);
		// Change Date value
		Date dateGet = immutableObject.getDate();
		dateGet.setTime(System.currentTimeMillis()); // it breaks immutability
		Custom customGet = immutableObject.getCustomObj();
		customGet.setName("Custom000"); // it breaks immutability
		int[] arrGet = immutableObject.getArr();
		arrGet[3] = 11; // it breaks immutability
		List<String> listGet = immutableObject.getList();
		listGet.add("str3"); // It breaks immutability
		List<Custom> listCustomGet = immutableObject.getListCustom();
		listCustomGet.add(customGet);// It breaks immutability
		Map<String, String> mapGet = immutableObject.getMap();
		mapGet.put("Key3", "Value3");// It breaks immutability
		System.out.println("After.................");
		System.out.println(immutableObject);

		// Deep copy is required in constructor as well
		list.add("New string to show that deep clonign is required in constructor also");
		System.out.println(immutableObject);
		list.add("Fixed"); // This can break immutability if deep cloning is not performed inside the
							// constructor
		System.out.println(immutableObject);
	}
}

final class MyImmutableClassFixed1 {

	private final String name;
	private final int regNo;
	private final Date date;
	private final int[] arr;
	private final Custom customObj;
	private final List<String> list;
	private final List<Custom> listCustom;
	private final Map<String, String> map;

	public MyImmutableClassFixed1(String name, int regNo, Date date, int[] arr, Custom customObj, List<String> list,
			List<Custom> listCustom, Map<String, String> map) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.date = date;
		this.arr = arr;
		this.customObj = customObj;
		List<String> listCopy = new ArrayList<>();
		// Deep cloning
		for (String element : list) {
			listCopy.add(element);
		}
		this.list = listCopy;
		this.listCustom = listCustom;
		this.map = map;

		// All deep cloning should be performed here as well
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	public Date getDate() {
		return (Date) date.clone();
	}

	public int[] getArr() {
		return arr.clone();
	}

	public Custom getCustomObj() {
		// Deep cloning
		Custom customObj1 = new Custom(customObj.getId(), customObj.getName());
		return customObj1;
	}

	public List<String> getList() {

		List<String> listCopy = new ArrayList<>();
		// Deep cloning
		for (String element : list) {
			listCopy.add(element);
		}
		return listCopy;
		// return Collections.unmodifiableList(list);
	}

	public List<Custom> getListCustom() {
		return listCustom;
	}

	public Map<String, String> getMap() {
		Map<String, String> mapCopy = new HashMap<>();
		for (Map.Entry<String, String> entry : this.map.entrySet()) {
			mapCopy.put(entry.getKey(), entry.getValue());
		}
		return mapCopy;
	}

	@Override
	public String toString() {
		return "MyImmutableClass [name=" + name + ", regNo=" + regNo + ", date=" + date + ", arr="
				+ Arrays.toString(arr) + ", customObj=" + customObj + ", list=" + list + ", listCustom=" + listCustom
				+ ", map=" + map + "]";
	}
}

final class MyImmutableClass {

	private final String name;
	private final int regNo;
	private final Date date;
	private final int[] arr;
	private final Custom customObj;
	private final List<String> list;
	private final List<Custom> listCustom;
	private final Map<String, String> map;

	public MyImmutableClass(String name, int regNo, Date date, int[] arr, Custom customObj, List<String> list,
			List<Custom> listCustom, Map<String, String> map) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.date = date;
		this.arr = arr;
		this.customObj = customObj;
		this.list = list;
		this.listCustom = listCustom;
		this.map = map;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	public Date getDate() {
		return date;
	}

	public int[] getArr() {
		return arr;
	}

	public Custom getCustomObj() {
		return customObj;
	}

	public List<String> getList() {
		return list;
	}

	public List<Custom> getListCustom() {
		return listCustom;
	}

	public Map<String, String> getMap() {
		return map;
	}

	@Override
	public String toString() {
		return "MyImmutableClass [name=" + name + ", regNo=" + regNo + ", date=" + date + ", arr="
				+ Arrays.toString(arr) + ", customObj=" + customObj + ", list=" + list + ", listCustom=" + listCustom
				+ ", map=" + map + "]";
	}

}

class Custom {
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

	public Custom(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Custom [id=" + id + ", name=" + name + "]";
	}

}
