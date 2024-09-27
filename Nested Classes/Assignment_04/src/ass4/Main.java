package ass4;

public class Main {
	public static void main(String[] args) {
		emiCalculator calc = (loanAmount, numberOfYears, rateOfInterest) -> {
			return (loanAmount * numberOfYears * rateOfInterest) / 100;
		};

		/*
		 * new emiCalculator() {
		 * 
		 * @Override public double getEmiAmount(double loanAmount, int numberOfYears,
		 * double rateOfInterest) { // TODO Auto-generated method stub return
		 * (loanAmount * numberOfYears * rateOfInterest) / 100; } };
		 * 
		 * Above entire part is replaces by
		 * 
		 * (loanAmount, numberOfYears, rateOfInterest) -> { // return (loanAmount *
		 * numberOfYears * rateOfInterest) / 100; // };
		 * 
		 */

		double emi1 = calc.getEmiAmount(100, 10, 9);
		double emi2 = calc.getEmiAmount(200, 11, 10);
		double emi3 = calc.getEmiAmount(300, 12, 11);

		System.out.println("emi 1: " + emi1);
		System.out.println("emi 2: " + emi2);
		System.out.println("emi 3: " + emi3);
	}

}
