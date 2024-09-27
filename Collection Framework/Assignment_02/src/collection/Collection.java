package collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

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
				list.add(line.trim());
			}
		} catch (Exception e) {
			System.err.println(e);
		}

		System.out.println("************ List accepted ************");

		System.out.println("************ No. of elements: " + list.size() + " ************");

		System.out.println("************ List Using advance for loop ************");

		for (String s : list) {
			System.out.print(s + "\t");
		}
		System.out.println();

		System.out.println("************ List Using Iterator ************");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}

		System.out.println();

		System.out.println("************ List From last to first ************");

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + "\t");
		}

		System.out.println();

		System.out.println("************ List using for each method ************");
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);

			}

		});

		System.out.println();

		System.out.println("************ List using for each Lambda fn ************");
		list.forEach((s) -> {
			System.out.println(s);
		});

		System.out.println();

		System.out.println("************ Sorted list ************");
		Collections.sort(list);
		System.out.println(list);

		System.out.println();

		System.out.println("************ Reversed list ************");
		System.out.println(list.reversed());

		try {
			System.out.println("Enter the string you want to retrive");
			line = br.readLine();
			int ind = list.indexOf(line);
			if (ind == -1) {
				System.out.println(line + " is not present in the list");
			} else {
				System.out.println(line + " is present at index: " + ind);
			}
		} catch (Exception e) {
			// TODO: handle exception
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
