package com.shyam.learning.oops;

//Changing return type was not allowed in method overriding before java5, it will give compile error
//Covariant return type is possible
//Must have same name and signature

//Before Java5, it was not possible to override any method by changing the return type. 
//But now, since Java5, it is possible to override method by changing the return type 
//It is called Covariant return type 
//The covariant return type specifies that the return type may vary in the 
//same direction as the subclass
//we cant change the return type of primitive type while overriding... 
//covariant return type is used for non primitive type

//if subclass overrides any method whose return type is Non-Primitive (class object type)
//but it changes its return type to subclass type. 

// Method overriding is run time polimorphism
// Is it also called Dynamic Method Dispatch

//Static methods can't be overriden,It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area.
//Though it is possible to have a static method with same signature in sub-class but in that case sub-class method hides the super class method rather than overriding it. There won't be any run time polymorphism in that case as static methods are bound during compile time; they are not resolved at run time.

//If you are overriding any method, overridden method (i.e. declared in subclass) 
//must not be more restrictive

/*If the superclass method does not declare an exception
If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
If the superclass method declares an exception
If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
*/
public class MethodOverriding extends MethodOverridingParent {

	public void display(String a, String b, String c) {
		System.out.println(a + " " + b + " " + c + " is the new result");
	}
	
	public MethodOverriding covariantExample(String a, String b, String c) {
		System.out.println(a + " " + b + " " + c);
		return new MethodOverriding();
	}

	public static void main(String args[]) {
		MethodOverriding obj = new MethodOverriding();
		obj.display("shyam", "sundar", "nayak");
	}
	
	

}

class MethodOverridingParent {

	public void display(String a, String b, String c) {
		System.out.println(a + " " + b + " " + c);
	}
	
	public MethodOverridingParent covariantExample(String a, String b, String c) {
		System.out.println(a + " " + b + " " + c);
		return new MethodOverridingParent();
	}

}
