package com.shyam.learning.designpattern.behavioural;

import java.util.ArrayList;
import java.util.List;

// Observer pattern is used when there is one-to-many relationship between objects 
// such as if one object is modified, its depenedent objects are to be notified 
// automatically
// just define a dependency so that when one object changes state, 
// all its dependents are notified and updated automatically

// Observer pattern uses three actor classes. Subject, Observer and Client
// Subject is an object having methods to attach and detach observers to a client object

public class ObserverDesignPatternExample {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}

// Step 1: Create Subject class.
class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}

//Step 2: Create Observer class.
abstract class Observer {
	protected Subject subject;

	public abstract void update();
}

// step 3:Create concrete observer classes
class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}
}

class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}
}

class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
	}
}
