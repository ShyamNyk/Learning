package com.shyam.learning.multithreading;
// We can pasue a thread in multiple ways

// 1) using Thread.sleep() or TimeUnit.sleep()
// 2) Using wait and notify but this not right approach. Wait and notify are meant for inter-thread communication.
// 3) Sleep method does not release the lock where as wait releases the lock
// Few point about Thread.sleep()
//1) Thread.sleep() is a static method and it always puts the current thread to sleep.
//2) You can wake-up a sleeping thread by calling interrupt() method on the thread which is sleeping.
//3)The sleep method doesn't guarantee that the thread will sleep for exactly that many milliseconds, its accuracy depends on upon system timers and it's possible for a thread to woke before.
//4)It doesn't release the lock it has acquired



public class ThreadPauseStopDemo {
	public static void main(String args[]) throws InterruptedException {

		Game game = new Game();
		Thread t1 = new Thread(game, "T1");
		t1.start();
		// t1.interrupt(); is used to 
		// Now, let's stop our Game thread
		System.out.println(Thread.currentThread().getName() + " is stopping game thread");
		game.stop();

		// Let's wait to see game thread stopped TimeUnit.MILLISECONDS.sleep(200);
		System.out.println(Thread.currentThread().getName() + " is finished now");

	}
}

class Game implements Runnable {
	private volatile boolean isStopped = false;

	public void run() {
		while (!isStopped) {
			System.out.println("Game thread is running.....");
			System.out.println("Game thread is now going to pause");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Game thread is now resumed ..");
		}
		System.out.println("Game thread is stopped....");
	}

	public void stop() {
		isStopped = true;
	}
}
