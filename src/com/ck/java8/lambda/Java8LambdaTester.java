package com.ck.java8.lambda;

//Lambda expression facilitates functional programming, and simplifies the development a lot.
//Lambda expressions are used primarily to define inline implementation of a functional interface.

//parameter -> expression body

public class Java8LambdaTester {
	//This is a functional interface
	interface MathOperation {
		int operation(int a, int b);
	}

	public static void main(String args[]) {
		Java8LambdaTester tester = new Java8LambdaTester();

		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;//Lambda expressions are used primarily to define inline implementation of a functional interface.

		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));
	}
	
	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}