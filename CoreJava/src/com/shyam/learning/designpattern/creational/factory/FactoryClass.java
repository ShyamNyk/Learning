package com.shyam.learning.designpattern.creational.factory;

public class FactoryClass {

	public static Plan getPlan(String planType) {

		if (planType == null) {
			return null;
		}

		if (planType.equalsIgnoreCase("Domestic")) {
			return new Domestic();
		} else if (planType.equalsIgnoreCase("Commercial")) {
			return new Commercial();
		} else if (planType.equalsIgnoreCase("Industrial")) {
			return new Industrial();
		}

		return null;
	}

}
