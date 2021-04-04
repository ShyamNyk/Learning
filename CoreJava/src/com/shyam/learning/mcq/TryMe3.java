package com.shyam.learning.mcq;

abstract class A {
	public abstract void a();

	public void b() {
		System.out.println("b");
	}
}

class B extends A {
	public void b() {
		System.out.println("AB");
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub

	}
}

public class TryMe3 {

	public static void main(String args[]) {

		B b = new B() {

			public void a() {
				System.out.println("A");
			}

			public void b() {
				System.out.println("B");
			}
		};
		b.b();

	}

}
