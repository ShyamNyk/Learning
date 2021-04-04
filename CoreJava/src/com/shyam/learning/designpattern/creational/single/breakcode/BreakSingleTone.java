package com.shyam.learning.designpattern.creational.single.breakcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;


//There are mainly 3 concepts which can break singleton property of a class. 

/*Serialization can also cause breakage of singleton property of singleton classes. 
 * Serialization is used to convert an object of byte stream and save in a file or 
 * send over a network. Suppose you serialize an object of a singleton class. 
 * Then if you de-serialize that object it will create a new instance and hence break 
 * the singleton pattern.
 * To overcome this issue, we have to implement method readResolve() method.
 * */

/*Cloning: Cloning is a concept to create duplicate objects. 
 * Using clone we can create copy of object. Suppose, 
 * we ceate clone of a singleton object, then it wil 
 * create a copy that is there are two instances of a singleton class, 
 * hence the class is no more singleton.
 * 
 * Overcome Cloning issue:- To overcome this issue, override clone() method and 
 * throw an exception from clone method that is CloneNotSupportedException. 
 * Now whenever user will try to create clone of singleton object, 
 * it will throw exception and hence our class remains singleton.
 * */

/*Reflection: Reflection can be caused to destroy singleton property of 
singleton class.Java Reflection is a process of examining or modifying the run time behavior of a class at run time.
Overcome reflection issue: To overcome issue raised by reflection, 
enums are used because java ensures internally that enum value is instantiated only once. 
Since java Enums are globally accessible, they can be used for singletons. 
Its only drawback is that it is not flexible i.e it does not allow lazy initialization.
*/

public class BreakSingleTone {

	public static void main(String args[])
			throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {

		/* Breaking singletone by serialization */

		SingleToneSerializable instance1 = SingleToneSerializable.getInstance();

		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(instance1);
		out.close();

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
		SingleToneSerializable instance2 = (SingleToneSerializable) in.readObject();
		in.close();
		System.out.println("==============Serialization===============");
		System.out.println("Serialzable instance1 hashCode:- " + instance1.hashCode());
		System.out.println("Serialzable instance2 hashCode:- " + instance2.hashCode());
		System.out.println();

		SingleToneSerializableFix instanceFixed1 = SingleToneSerializableFix.instance;

		ObjectOutput out1 = new ObjectOutputStream(new FileOutputStream("file1.text"));
		out1.writeObject(instanceFixed1);
		out1.close();

		// deserailize from file to object
		ObjectInput in1 = new ObjectInputStream(new FileInputStream("file1.text"));
		SingleToneSerializableFix instanceFixed2 = (SingleToneSerializableFix) in1.readObject();
		in1.close();

		System.out.println("Serialzable instanceFixed1 hashCode:- " + instanceFixed1.hashCode());
		System.out.println("Serialzable instanceFixed2 hashCode:- " + instanceFixed2.hashCode());
		System.out.println("==============Serialization===============");
		System.out.println();
		System.out.println();
		/* Breaking singletone by serialization */

		/* Breaking singletone by reflection */
		System.out.println("==============Reflection===============");

		SingleToneReflecable singleToneReflecable1 = SingleToneReflecable.instance;
		SingleToneReflecable singleToneReflecable2 = null;

		try {
			Constructor[] constructors = SingleToneReflecable.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				singleToneReflecable2 = (SingleToneReflecable) constructor.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("singleToneReflecable1.hashCode():- " + instance1.hashCode());
		System.out.println("singleToneReflecable2.hashCode():- " + instance2.hashCode());
		System.out.println("==============Reflection===============");
		System.out.println();
		System.out.println();
		/* Breaking singletone by reflection */

		/* Breaking singletone by cloning */
		System.out.println("==============Cloning===============");
		SingleToneClonable instanceClonable1 = new SingleToneClonable();
		SingleToneClonable instanceClonable2 = (SingleToneClonable) instanceClonable1.clone();
		System.out.println("instanceClonable1 hashCode:- " + instanceClonable1.hashCode());
		System.out.println("instanceClonable1 hashCode:- " + instanceClonable2.hashCode());
		System.out.println();
		SingleToneClonableFix instanceClonableFix1 = new SingleToneClonableFix();
		System.out.println("instanceClonableFix1 hashCode:- " + instanceClonableFix1.hashCode());
		SingleToneClonableFix instanceClonableFix2 = (SingleToneClonableFix) instanceClonableFix1.clone();
		System.out.println("instanceClonableFix2 hashCode:- " + instanceClonableFix2.hashCode());
		System.out.println("==============Cloning===============");
		/* Breaking singletone by cloning */

	}

	// Overcome serialization issue:- To overcome this issue, we have to implement
	// method readResolve() method.

	// Overcome Cloning issue:- To overcome this issue, override clone() method and
	// throw an exception from clone method that is CloneNotSupportedException. Now
	// whenever user will try to create clone of singleton object, it will throw
	// exception and hence our class remains singleton.

	// Overcome reflection issue: To overcome issue raised by reflection, enums are
	// used because java ensures internally that enum value is instantiated only
	// once. Since java Enums are globally accessible, they can be used for
	// singletons. Its only drawback is that it is not flexible i.e it does not
	// allow lazy initialization.

}
