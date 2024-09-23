package BufferReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderIOLine {
	public static void main(String[] args) {
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\tEnter your input \n\n\tInput \"quit\" to quit");

		int n;
		int maxLen = 0;

		String line;
		String maxLine = null;

		try {
			while (!(line = buffReader.readLine()).equals("quit")) {
//				System.out.print((char) n);
				if (line.length() > maxLen) {
					maxLen = line.length();
					maxLine = line;
				}
			}

			System.out.println("\n\nmsx intehere: " + maxLen + "\nmaxLine: " + maxLine);
		} catch (Exception e) {
			System.err.println(e);
			// TODO: handle exception
		}

	}

}
