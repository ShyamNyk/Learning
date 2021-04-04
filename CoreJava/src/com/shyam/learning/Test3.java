package com.shyam.learning;

public class Test3 implements Runnable {

	@Override
	public void run() {
		new Thread(new Test3("Wallace")).start();
		
		new Thread(new Test3("dfsd")).start();
	}
	
	private String name;
	public Test3(String name) {
		this.name=name;
	}
	
	
	
	

}
