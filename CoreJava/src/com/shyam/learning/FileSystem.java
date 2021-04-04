package com.shyam.learning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSystem {

	public static void main(String args[]) throws IOException {

		Scanner sc = new Scanner(new File("input-data")); // System.in is a standard input stream
		BufferedReader reader = new BufferedReader(new FileReader("input-data"));
		List<String> list = new ArrayList<>();

		String st;
		while ((st = reader.readLine()) != null) {
			System.out.println(st);
			list.add(st);
		}
		
		//System.out.println(list);
		
		for (String str:list) {
			System.out.println(countBlocks(str));
		}
	}

	private static int countBlocks(String str) {
		
		int count = 0;
		for (int i =0;i<str.length();i++) {
			if (str.charAt(i) == '*') {
				count++;
			}
		}
		
		return count;
	}

}
