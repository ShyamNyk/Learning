package com.shyam.learning.designpattern.behavioural;

// Iterator pattern is very commonly used design pattern in Java and .Net programming
// environment. This pattern is used to get a way to access the elements of a 
// collection object in sequential manner without exposing its 
// underlying representation.

// The Iterator pattern is also known as Cursor.
// java.util.Iterator interface uses Iterator Design Pattern.

public class IteratorDesignPatternExample {

	 public static void main(String[] args) {
	      NameRepository namesRepository = new NameRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
	
}

interface Iterator {
	public boolean hasNext();

	public Object next();
}

interface Container {
	public Iterator getIterator();
}

class NameRepository implements Container {
	   public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

	   @Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }
	}
