package math;

public class Main {
	public static void main(String[] args) {
		Math.Calculator<Integer> calculator = new Math.Calculator<>();

		System.out.println(calculator.add(5, 10));
		System.out.println(calculator.substract(10, 5));
		System.out.println(calculator.multiply(10, 5));
		System.out.println(calculator.divide(10, 5));
	}
}
