package com.shyam.learning;

import java.util.Collections;
import java.util.List;

public final class MyImmutableClass { // first step

	final private String name; // 2nd step
	final private List<String> list;
	final private Employee1 emp;

	public MyImmutableClass(String name, final List<String> list, final Employee1 emp) { // 3rd step
		super();
		this.name = name;
		this.list = list;
		this.emp = emp;
	}

	// no stter methods // 4th step

	// get methods // 5th step

	public String getName() {
		return name;
	}

	public List<String> getList() {

		return Collections.unmodifiableList(list);
	}

	public Employee1 getEmp() {

		Employee1 obj = new Employee1();
		obj.id = emp.getId();
		obj.salary = emp.getSalary();

		return obj;
	}

}
