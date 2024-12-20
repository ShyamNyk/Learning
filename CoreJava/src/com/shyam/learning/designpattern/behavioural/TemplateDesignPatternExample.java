package com.shyam.learning.designpattern.behavioural;

// A Template Pattern says that "just define the skeleton of a function in an 
// operation, deferring some steps to its subclasses".

/*In Template pattern, an abstract class exposes defined way(s)/template(s) to 
execute its methods. Its subclasses can override the method implementation as per 
need but the invocation is to be in the same way as defined by an abstract class.*/

// Benefits:
// It is very common technique for reusing the code.This is only the main benefit of it

// Usage
// It is used when the common behavior among sub-classes should be moved to a single common class by avoiding the duplication.

public class TemplateDesignPatternExample {

	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}

class Football extends Game {

	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}
}

class Cricket extends Game {

	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}
}

abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// template method
	public final void play() {

		// initialize the game
		initialize();

		// start game
		startPlay();

		// end game
		endPlay();
	}
}
