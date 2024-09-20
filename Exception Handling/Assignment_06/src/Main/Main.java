package Main;

import java.util.Scanner;

import Exceptions.InvalidPwdException;

public class Main {

	static boolean isCap(char c) {
		return c >= 'A' && c <= 'Z';
	}

	static boolean isSmall(char c) {
		return c >= 'a' && c <= 'z';
	}

	static boolean isNum(char c) {
		return c >= '0' && c <= '9';
	}

	static boolean isSpecial(char c) {
		return ((!isNum(c)) && (!isCap(c)) && (!isSmall(c)));
	}

	public static boolean checkPwd(String password) throws InvalidPwdException {
		boolean isCapPresent = false;
		boolean isNumPresent = false;
		boolean isSpecialCharPresent = false;

		for (int i = 0; i < password.length(); i++) {
			if (isCap(password.charAt(i))) {
				isCapPresent = true;
			}

			if (isNum(password.charAt(i))) {
				isNumPresent = true;
			}

			if (isSpecial(password.charAt(i))) {
				isSpecialCharPresent = true;
			}
		}

		if (!isCapPresent) {
			throw new InvalidPwdException("At least one capital letter required");
		}

		if (!isNumPresent) {
			throw new InvalidPwdException("At least one number required");
		}

		if (!isSpecialCharPresent) {
			throw new InvalidPwdException("At least one special character required");
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
		String password = sc.nextLine();

		try {
			checkPwd(password);
			System.out.println("Welcome");
		} catch (InvalidPwdException e) {
			System.err.println(e);
		}

	}
}
