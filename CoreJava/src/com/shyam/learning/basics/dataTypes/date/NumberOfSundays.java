package com.shyam.learning.basics.dataTypes.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NumberOfSundays {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		long calendarMillis = calendar.getTimeInMillis();
		long currentMillis = System.currentTimeMillis();
		System.out.println(currentMillis);

		Date firstDate = new Date(1111111111);
		Date secondDate = new Date(999999999);
		System.out.println("First Date : " + firstDate);
		System.out.println("Second Date : " + secondDate);
		SimpleDateFormat startDate = new SimpleDateFormat("01/01/2016");
		SimpleDateFormat endDate = new SimpleDateFormat("01/01/2018");
		//System.out.println(getWorkingDaysBetweenTwoDates(startDate,endDate));
		


	}
	
	public static int getWorkingDaysBetweenTwoDates(Date startDate, Date endDate) {
	    Calendar startCal = Calendar.getInstance();
	    startCal.setTime(startDate);        

	    Calendar endCal = Calendar.getInstance();
	    endCal.setTime(endDate);

	    int workDays = 0;

	    //Return 0 if start and end are the same
	    if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
	        return 0;
	    }

	    if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
	        startCal.setTime(endDate);
	        endCal.setTime(startDate);
	    }

	    do {
	       //excluding start date
	        startCal.add(Calendar.DAY_OF_MONTH, 1);
	        if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
	            ++workDays;
	        }
	    } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

	    return workDays;
	}

}
