package com.shyam.learning.basics.exception;

// Can we catch error ?
// Yes, you can catch an Error, but you are advised not to do it, 
// since Errors indicate serious problems that a reasonable application should not try to catch. (as stated in the Javadoc of Error)

public class ErrorExample {

	public static void main(String args[]) {

		isItAValidCode1();
		isItAValidCode2();

	}

	private static void isItAValidCode2() {
		try {
			new ErrorExample().go();
		} catch (Error e) {
			System.out.println("isItAValidCode2 " + e);
		}

	}

	// Yes , it is a valid code
	private static void isItAValidCode1() {
		try {
			int x = 1 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} catch (Error e) {
			System.out.println(e.getMessage());
		}

	}

	void go() {
		go();
	}

}
