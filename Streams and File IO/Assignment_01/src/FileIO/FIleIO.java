package FileIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FIleIO {

	public static void main(String[] args) {
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\tEnter your input \n\n\tInput 'q' to quit");

		int n;
		int digitCount = 0;
		int alphabetsCount = 0;;
		
		try {
			while ((n = buffReader.read()) != 'q') {
//				System.out.print((char) n);
				if(Character.isDigit(n)) {
					digitCount++;
				}else if(Character.isAlphabetic(n)) {
					alphabetsCount++;
				}
			}
			
			System.out.println("\n\nAlphabets: " + alphabetsCount + "\ndigit count: " + digitCount);
		} catch (Exception e) {
			System.err.println(e);
			// TODO: handle exception
		}

	}

}
