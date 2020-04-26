package com.shyam.learning.basics.dataTypes.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String args[]) {
		// Instantiate a Date object
		Date currentDate = new Date();
		System.out.println("Current Date: " +currentDate);
		
		SimpleDateFormat ft = 
			      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		 System.out.println("Current Date: " + ft.format(currentDate));
		
	}

}
