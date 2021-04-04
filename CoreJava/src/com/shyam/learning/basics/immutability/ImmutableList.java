package com.shyam.learning.basics.immutability;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableList {

	private final List<String> list = new ArrayList<String>();

	public ImmutableList() {
        list.add("A");
        list.add("B");
    }

	public List<String> getImmutableList() {
		List<String> finalList = new ArrayList<String>();
		list.forEach(s -> finalList.add(s));
		return finalList;
	}

	public static void main(String[] args) {
		ImmutableList obj = new ImmutableList();
		System.out.println(obj.getImmutableList());
		obj.getImmutableList().add("C");
		System.out.println(obj.getImmutableList());
	}
}
