package com.shyam.learning.collections.list;

import java.util.ArrayList;
import java.util.List;

public final class CustomImmutableList {

	private final List<String> list = new ArrayList<String>();

	public CustomImmutableList() {
        list.add("A");
        list.add("B");
    }

	public List<String> getImmutableList() {
		List<String> finalList = new ArrayList<String>();
		list.forEach(s -> finalList.add(s));
		return finalList;
	}

	public static void main(String[] args) {
		CustomImmutableList obj = new CustomImmutableList();
		System.out.println(obj.getImmutableList());
		obj.getImmutableList().add("C");
		System.out.println(obj.getImmutableList());
	}
}
