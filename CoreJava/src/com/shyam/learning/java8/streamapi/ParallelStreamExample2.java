package com.shyam.learning.java8.streamapi;

import java.util.ArrayList;
import java.util.List;

/*The parallel stream by default uses ForkJoinPool.commonPool which has one less 
thread than number of processor.This means parallel stream uses all available 
processors because it uses the main thread as well.*/

public class ParallelStreamExample2 {
	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			data.add(i);
		}

	}
}
