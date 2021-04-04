package com.shyam.learning;

public class Test2 implements Runnable{
	
	public void run() {
		System.out.println("running");
	}
	
	public static void main (String args[]) {
		Thread ty = new Thread(new Test2());
		ty.run();
		ty.run();
		ty.start();

	}

}
