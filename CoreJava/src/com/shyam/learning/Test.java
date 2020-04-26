package com.shyam.learning;

import java.util.ArrayList;
import java.util.List;


class Test {
	public static void main(String args[]) {
		//new Test() == new Test();
		System.out.println(new Car().equals(new Car()));
		List list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		System.out.println(list.size());
		clearList(list);
		list=null;
		System.out.println(list.size());
		
	}


	static void clearList(List list){
		list.add(3);
	list = null;
	}}

/*
 * class Car{ private int model = 5; }
 */