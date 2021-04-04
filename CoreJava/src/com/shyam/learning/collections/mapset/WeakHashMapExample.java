package com.shyam.learning.collections.mapset;

/*Java.util.HashMap class is a Hashing based implementation. In HashMap, we have a key and a value pair.
Even though the object is specified as key in hashmap, it does not have any reference and it is not eligible for garbage collection if it is associated with HashMap i.e. HashMap dominates over Garbage Collector.
*/
import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) throws InterruptedException, RuntimeException {
		HashMap m = new HashMap();
		Demo d = new Demo();

		// puts an entry into HashMap
		m.put(d, " Hi ");

		System.out.println(m);
		d = null;

		// garbage collector is called
		System.gc();

		// thread sleeps for 4 sec
		Thread.sleep(4000);

		System.out.println(m);

		WeakHashMap wm = new WeakHashMap();
		Demo wd = new Demo();

		// puts an entry into WeakHashMap

		wm.put(wd, " Hi ");
		System.out.println(wm);

		wd = null;

		// garbage collector is called
		System.gc();

		System.out.println(wm);
	}

}

class Demo {
	public String toString() {
		return "demo";
	}

	// finalize method
	public void finalize() {
		System.out.println("Finalize method is called");
	}
}
