package com.shyam.learning.java8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparingObjetsUsingStreamAPI {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");

		/*
		 * List<String> sortedList = list.stream() .sorted(Comparator.naturalOrder())
		 * .collect(Collectors.toList());
		 * 
		 * List<String> sortedList = list.stream() .sorted((o1,o2)-> o1.compareTo(o2))
		 * .collect(Collectors.toList());
		 */

		List<String> sortedList1 = list.stream().sorted().collect(Collectors.toList());

		sortedList1.forEach(System.out::println);
		System.out.println();

		List<String> sortedList2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		sortedList2.forEach(System.out::println);

		List<User> users = Arrays.asList(new User("C", 30), new User("D", 40), new User("A", 10), new User("B", 20),
				new User("E", 50));

		List<User> sortedList = users.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge())
				.collect(Collectors.toList());

		/*
		 * List<User> sortedList =
		 * users.stream().sorted(Comparator.comparingInt(User::getAge))
		 * .collect(Collectors.toList());
		 */
		
		// Reverse Order
		 List<User> sortedList11 = users.stream()
			        .sorted(Comparator.comparingInt(User::getAge)
			        .reversed())
			        .collect(Collectors.toList());

		sortedList11.forEach(System.out::println);
		
		// compareByName
		List<User> sortedList12 = users.stream()
		        .sorted(Comparator.comparing(User::getName))
		        .collect(Collectors.toList());

	}

	static class User {

		private String name;
		private int age;

		public User(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
		}
	}
}
