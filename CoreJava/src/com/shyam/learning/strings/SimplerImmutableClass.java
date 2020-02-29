package com.shyam.learning.strings;

import java.util.Date;

public class SimplerImmutableClass {

	final private String name;
	final private int regNo;

	public SimplerImmutableClass(String name, int regNo) {
		this.name = name;
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

}

/*
 * Some time you may need to write immutable class which includes mutable
 * classes like java.util.Date, despite storing Date into final field it can be
 * modified internally, if internal date is returned to the client. In order to
 * preserve immutability in such cases, its advised to return copy of original
 * object, which is also one of the Java best practice. There is another example
 * of making a class immutable in Java, which includes mutable member variable.
 */


final class ImmutableReminder{
    private final Date remindingDate;
  
    public ImmutableReminder (Date remindingDate) {
        if(remindingDate.getTime() < System.currentTimeMillis()){
            throw new IllegalArgumentException("Can not set reminder  for past time: " + remindingDate);
        }
        this.remindingDate = new Date(remindingDate.getTime());
    }
  
    public Date getRemindingDate() {
        return (Date) remindingDate.clone();
    }
}



