package com.shyam.learning.java8.streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IterateThroughListAndMap {

	public static void main(String args[]) {

		List<String> list = new ArrayList<String>();
		list.add("shyam1");
		list.add("shyam2");
		list.add("shyam3");
		list.stream().forEach(p->System.out.println(p));
		System.out.println();
		list.stream().filter(p->p.endsWith("3")).forEach(p->System.out.println(p));
		System.out.println();
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "shyam1");
		map.put(2, "shyam2");
		map.put(3, "shyam3");
		map.forEach((key,value)->System.out.println(key+":"+value));
		System.out.println();
		map.entrySet().stream().forEach((obj)->System.out.println(obj));

	}

}
