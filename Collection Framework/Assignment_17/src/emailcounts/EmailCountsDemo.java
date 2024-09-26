package emailcounts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class EmailCountsDemo {
	public static void main(String[] args) {
		// read file line by line and check if it contains domain
		// add domains in map accordingly
		String PATH = "C:\\Users\\ahirr\\OneDrive\\Desktop\\Common\\emails.txt";
		Map<String, Integer> map = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {

			String line;

			while ((line = br.readLine()) != null) {
				String[] email = line.split("@");
				String domain = email[email.length - 1];

				if (map.containsKey(domain)) {
					int count = map.get(domain);
					map.put(domain, count + 1);
				} else {
					map.put(domain, 1);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
