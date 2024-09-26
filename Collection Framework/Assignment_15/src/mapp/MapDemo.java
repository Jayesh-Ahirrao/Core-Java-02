package mapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(null, null);
		map.put(1, "Apple");
		map.put(2, "Ball");
		map.put(3, "cat");
		map.put(4, "dog");

		// create a entry set
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

		for (Map.Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
