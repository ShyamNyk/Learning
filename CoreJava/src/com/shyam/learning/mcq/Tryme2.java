package com.shyam.learning.mcq;

import java.util.HashSet;
import java.util.Iterator;

public class Tryme2 {

	public String str;

	public Tryme2(String str) {
		this.str = str;
	}

	public static void main(String args[]) {

		Tryme2 h1 = new Tryme2("1");
		Tryme2 h2 = new Tryme2("1");
		String s1 = new String("2");
		String s2 = new String("2");

		HashSet<Object> hs = new HashSet<Object>();
		hs.add(h1);
		hs.add(h2);
		hs.add(s1);
		hs.add(s2);
		System.out.println(hs.size());
		System.out.println();
		Iterator<Object> i = hs.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}

}
