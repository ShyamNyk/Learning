package com.shyam.learning.multithreading;

// ThreadLocal in Java is another way to achieve thread-safety apart from writing immutable classes
// In thread local, you can set any object and this object will be local and global to the specific thread which is accessing this object
public class ThreadLocalExp {

	public static class MyRunnable implements Runnable {
		private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

		@Override
		public void run() {
			threadLocal.set((int) (Math.random() * 50D));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(threadLocal.get());
		}
	}

	public static void main(String[] args) {
		MyRunnable runnableInstance = new MyRunnable();

		Thread t1 = new Thread(runnableInstance);
		Thread t2 = new Thread(runnableInstance);
		// this will call run() method
		t1.start();
		t2.start();
	}

}
