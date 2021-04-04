package com.shyam.learning.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//They can return a primitive value (boolean or long), a concrete type (Optional value object), or void (creating side effect).
//They are eagerly executed, and a terminal operation is always the last operation in a Stream pipeline.

public class TerminalOperationsExample {

	public static void main(String args[]) {
		List<Person> listPersons = new ArrayList<>();
		listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26));
		listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));
		listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23));
		listPersons.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, 39));
		listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));
		listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33));
		listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));
		listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30));
		listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22));
		listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));

		// allMatch()
		boolean areAllMale = listPersons.stream().allMatch(p -> p.getGender().equals(Gender.MALE));
		System.out.println("Are all persons male? " + areAllMale);
		boolean useGMail = listPersons.stream().allMatch(p -> p.getEmail().endsWith("gmail.com"));
		System.out.println("Does everyone use GMail? " + useGMail);

		// anyMatch()
		boolean anyFemale = listPersons.stream().anyMatch(p -> p.getGender().equals(Gender.FEMALE));

		System.out.println("Is there any female? " + anyFemale);
		boolean anyTeenager = listPersons.stream().anyMatch(p -> p.getAge() < 20);

		System.out.println("Is there any teenager? " + anyTeenager);

		// noneMatch()
		boolean noYahooMail = listPersons.stream().noneMatch(p -> p.getEmail().endsWith("yahoo.com"));

		System.out.println("No one uses Yahoo mail? " + noYahooMail);

		// collect()
		List<String> listEmails = listPersons.stream().map(p -> p.getEmail()).collect(Collectors.toList());

		System.out.println("List of Emails: " + listEmails);

		// Count
		long totalMale = listPersons.stream().filter(p -> p.getGender().equals(Gender.MALE)).count();
		System.out.println("Total male: " + totalMale);

		// forEach
		System.out.println("People are female:");
		listPersons.stream().filter(p -> p.getGender().equals(Gender.FEMALE)).forEach(System.out::println);

		// min(comparator)
		Optional<Person> min = listPersons.stream().filter(p -> p.getGender().equals(Gender.FEMALE))
				.min((p1, p2) -> p1.getAge() - p2.getAge());
		if (min.isPresent()) {
			Person youngestGirl = min.get();
			System.out.println("The youngest girl is: " + youngestGirl + " (" + youngestGirl.getAge() + ")");
		}

		// max (comparator)
		Optional<Person> max = listPersons.stream().filter(p -> p.getGender().equals(Gender.MALE))
				.max((p1, p2) -> p1.getAge() - p2.getAge());
		if (max.isPresent()) {
			Person oldestMan = max.get();
			System.out.println("The oldest man is: " + oldestMan + " (" + oldestMan.getAge() + ")");
		}

		// reduce
		// It has three versions
		// Version #1: Optional<T> reduce(BinaryOperator<T> accumulator)
		Optional<String> reducedValue = listPersons.stream().map(p -> p.getFirstName())
				.reduce((name1, name2) -> name1 + ", " + name2);

		if (reducedValue.isPresent()) {
			String names = reducedValue.get();
			System.out.println(names);
		}

	}

}

class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private String email;
	private Gender gender;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
	}

	public Person(String firstName, String lastName, String email, Gender gender, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	// geters and setters go here...

	public int compareTo(Person another) {
		return this.age - another.getAge();
	}

	public String toString() {
		return this.firstName + " " + this.lastName;
	}
}

enum Gender {
	MALE, FEMALE
}
