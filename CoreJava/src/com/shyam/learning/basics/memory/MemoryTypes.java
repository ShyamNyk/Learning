package com.shyam.learning.basics.memory;

/*Most of the JVM implementation divides memory into following parts:

1-Method Area - logical part of heap area
2-Stack  
3-Heap
4-PC registers
5-Native method stacks.*/
//Similar to Java stack, native methods are executed on the Native method stacks., native mthods are written in java

/*When an instance of this object is created from a class X
Lava l = new Lava();
First, Class type of Lava, i.e. Lava.class is stored in your Method area, 
with details like methods, fields and other referencing type. 
Also static variables like j in our example is stored in Method area itself.

Second the instance of Object Lava is stored in Heap Area as well as its instance variable i.e i.

Third, Its reference, i.e l in our example is stored in Stack area, which point to instance that is created in Heap.
*/
public class MemoryTypes {
	int i = 5;
	static int j = 10;
	void flow() { // some implementation}
	}
}
// MemoryTypes memoryType = new MemoryTypes();
// Reference memoryType gets stored in stack
// But the real objects gets stored in the heap

// Instance variable is declared inside a class but not inside a method - STORED IN HEAP
// Local variable are declared inside a method including method arguments. - STORED IN STACK
