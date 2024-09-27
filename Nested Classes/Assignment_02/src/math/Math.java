package math;

public class Math {

	public class Calculator<T extends Number> {

		// You cannot add the T as java doesnt has operator overloading
		public double add(T num1, T num2) {
			return num1.doubleValue() + num2.doubleValue();
		}

		public double substract(T num1, T num2) {
			return num1.doubleValue() - num2.doubleValue();
		}

		public double multiply(T num1, T num2) {
			return num1.doubleValue() * num2.doubleValue();
		}

		public double divide(T num1, T num2) {
			return num1.doubleValue() / num2.doubleValue();
		}

	}
}
