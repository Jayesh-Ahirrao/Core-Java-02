package Exceptions;

import java.util.Scanner;

public class UserRegistration {
	public static void registerUser(String username, String userCoutry)
			throws IllegalArgumentException, InvalidCountryExceptions {
		if (username.isEmpty()) {
			throw new IllegalArgumentException("Username cannot be empty");
		}

		if (userCoutry.isEmpty()) {
			throw new IllegalArgumentException("Country cannot be empty");
		}

		if (!userCoutry.equals("India")) {
			throw new InvalidCountryExceptions("User outside India cannot be registered");
		}

		System.out.println("User registered successfully");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username, userCountry;
		System.out.println("Enter username");
		username = sc.nextLine();
		System.out.println("Enter the country of user");
		userCountry = sc.nextLine();

		try {
			registerUser(username, userCountry);
		} catch (IllegalArgumentException e) {
			System.err.println(e);
		} catch (InvalidCountryExceptions e) {
			System.err.println(e);
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			sc.close();
		}
	}
}
