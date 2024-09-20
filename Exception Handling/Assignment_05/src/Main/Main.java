package Main;

import java.util.Scanner;

import Exceptions.IncorrectFormattingExceptions;

public class Main {
	public static boolean isCapital(char c) {
		return (c >= 'A' && c <= 'Z');
	}

	public static boolean checkFormatting(String str) {
		// checks for first letter to be capital
		if (!isCapital(str.charAt(0)))
			return false;

		// checks for all rest letter should not be capital
		for (int i = 1; i < str.length(); i++) {
			if (isCapital(str.charAt(i)))
				return false;
		}

		return true;
	}

	public static boolean verifyUser(String firstName, String lastName) throws IncorrectFormattingExceptions {
		if (firstName.isEmpty() || lastName.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}

		if (!checkFormatting(firstName) || !checkFormatting(lastName)) {
			throw new IncorrectFormattingExceptions("Only first letter should be capital");
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.nextLine();
		System.out.println("Enter last name");
		String lastName = sc.nextLine();

		System.out.println(firstName + " " + lastName);

		try {
			verifyUser(firstName, lastName);
			System.out.println("welcom " + firstName + " " + lastName);
		} catch (IncorrectFormattingExceptions e) {
			System.err.println(e);
		}
	}

}
