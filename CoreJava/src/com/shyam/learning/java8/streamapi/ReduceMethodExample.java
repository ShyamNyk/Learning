package com.shyam.learning.java8.streamapi;

import java.util.ArrayList;
import java.util.List;

/*This method takes a sequence of input elements and combines 
them into a single summary result by repeated operation. 
For example, finding the sum of numbers, 
or accumulating elements into a list.*/

public class ReduceMethodExample {

	public static void main(String args[]) {

		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		// This is more compact approach for filtering data
		Float totalPrice = productsList.stream().map(product -> product.price).reduce(0.0f,
				(sum, price) -> sum + price); // accumulating price
		System.out.println(totalPrice);
		// More precise code
		float totalPrice2 = productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum); // accumulating
																											// price, by
																											// referring
																											// method of
																											// Float
																											// class
		System.out.println(totalPrice2);
	}

}

class Product1 {
	int id;
	String name;
	float price;

	public Product1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
