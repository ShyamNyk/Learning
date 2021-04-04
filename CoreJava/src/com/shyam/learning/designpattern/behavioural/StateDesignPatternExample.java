package com.shyam.learning.designpattern.behavioural;

// In State pattern a class behavior changes based on its state

// In State pattern, we create objects which represent various states and a Context1 object whose behavior varies as its state object changes

public class StateDesignPatternExample {

	public static void main(String[] args) {
		Context1 context = new Context1();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}

}

interface State {
	public void doAction(Context1 Context1);
}

class StartState implements State {

	public void doAction(Context1 Context1) {
		System.out.println("Player is in start state");
		Context1.setState(this);
	}

	public String toString() {
		return "Start State";
	}
}

class StopState implements State {

	public void doAction(Context1 Context1) {
		System.out.println("Player is in stop state");
		Context1.setState(this);
	}

	public String toString() {
		return "Stop State";
	}
}

class Context1 {
	private State state;

	public Context1() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}