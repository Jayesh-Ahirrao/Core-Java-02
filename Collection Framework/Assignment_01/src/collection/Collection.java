package collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<>();
		String line;
		System.out.println("Enter the list of strings, Enter 'quit' to end");
		int index;
		try {
			while (!(line = br.readLine()).equals("quit")) {
				list.add(line);
			}
			System.out.println("************ List accepted ************");
			System.out.print("Enter the index you want to delete\t");

			index = Integer.parseInt(br.readLine());
			String deletedS = list.remove(index);
			System.out.println("************ " + deletedS + " Deleted ************");
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		}

	}

}
