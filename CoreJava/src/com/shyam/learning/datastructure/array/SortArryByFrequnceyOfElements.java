package com.shyam.learning.datastructure.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Given an integer array, sort the array according to the frequency of elements in decreasing order, 
// if frequency of two elements are same then sort in increasing order
// Input: arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}
// Output: 3 3 3 3 2 2 2 12 12 4 5

public class SortArryByFrequnceyOfElements {

	static List<Integer> outPutList = new ArrayList<Integer>();

	// Driver Code
	public static void main(String[] args) {

		// Declare and Initialize an array
		int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };
		sortByFrequency(array);
	}

	private static void sortByFrequency(int[] array) {

		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> outputArray = new ArrayList<>();

		// Assign elements and their count in the list and map
		for (int element : array) {

			if (map.containsKey(element)) {
				map.put(element, map.get(element) + 1);
			} else {
				map.put(element, 1);
			}
		}

		map = sortByValue(map);

		for (Map.Entry<Integer,Integer> hm: map.entrySet()) {
			
			for (int i=0;i<hm.getValue();i++) {
				outPutList.add(hm.getKey());
			}	
		}
		System.out.println(outPutList);

	}

	public static HashMap<Integer, Integer> sortByValue(Map<Integer, Integer> hm) {
		// Create a list from elements of HashMap
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// put data from sorted list to hashmap
		HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

}
