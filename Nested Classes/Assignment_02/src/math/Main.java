package math;

import math.Math.Calculator;

public class Main {
	public static void main(String[] args) {
		Math math = new Math();

		Calculator<Integer> calculator = math.new Calculator<Integer>();

		System.out.println(calculator.add(5, 10));
		System.out.println(calculator.substract(10, 5));
		System.out.println(calculator.multiply(10, 5));
		System.out.println(calculator.divide(10, 5));
	}
}
