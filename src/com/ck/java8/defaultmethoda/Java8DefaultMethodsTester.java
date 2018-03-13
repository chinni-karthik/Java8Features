package com.ck.java8.defaultmethoda;

//These are introduced for backward compatibility.
//For example, ‘List’ or ‘Collection’ interfaces do not have ‘forEach’ method declaration.
//Thus, adding such method will simply break the collection framework implementations.
//Java 8 introduces default method so that List/Collection interface can have a default implementation of forEach method,
//and the class implementing these interfaces need not implement the same.

public class Java8DefaultMethodsTester {

	public static void main(String args[]) {
		Vehicle vehicle = new Car();
		vehicle.print();
	}
}

interface Vehicle {

	default void print() {
		System.out.println("I am a vehicle!");
	}

	static void blowHorn() {//Can have static default methods as well.
		System.out.println("Blowing horn!!!");
	}
}

interface FourWheeler {

	default void print() {
		System.out.println("I am a four wheeler!");
	}
}

//Ambiguity is resolved in below way. Ambiguity occurs as the class implements two interfaces with same method implementation.
class Car implements Vehicle, FourWheeler {

	public void print() {
		Vehicle.super.print();//user interface.super.method() to solve ambiguity occurred. Here you are overriding print() itself and calling super interfaces as per your convenience.
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("I am a car!");
	}
}