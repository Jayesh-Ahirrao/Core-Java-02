package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {
	public static void main(String[] args) {
		String line;
		List<String> list = new ArrayList<>();
		System.out.println("Enter Strings, \t enter 'quit' once done");

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			while (!(line = br.readLine()).equals("quit")) {
				list.add(line);
			}
			System.out.println("*************** Input Recieved ***************");
		} catch (Exception e) {
			e.printStackTrace();
		}

		Collections.sort(list, new Comparator<>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int diff = o1.length() - o2.length();

				if (diff == 0) {
					diff = o1.compareTo(o2);
				}
				return diff;
			}
		});

		for (String s : list) {
			System.out.println(s);
		}

	}
}
