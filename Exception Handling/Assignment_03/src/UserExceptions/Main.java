package UserExceptions;

import java.util.Scanner;

public class Main {
	public static void validatePassword(String password)
			throws IllegalArgumentException, PasswordTooLong, PasswordTooShort {
		if (password.isEmpty()) {
			throw new IllegalArgumentException("password cannot be empty");
		} else if (password.length() < 8) {
			throw new PasswordTooShort("Password must be at least 8 characters");
		} else if (password.length() > 12) {
			throw new PasswordTooLong("Password cannot be more than 12 characters");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password;
		System.out.println("Enter the password");
		password = sc.nextLine();

		try {
			validatePassword(password);
			System.out.println("Password accpeted");
			System.out.println("Password: " + password);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
