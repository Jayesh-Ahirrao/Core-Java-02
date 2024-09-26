import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringVowels {

	public static Set<Character> vowels = new HashSet<>();

	public static boolean isVowel(char cInput) {
		return vowels.contains(cInput);
	}

	public static int countVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i)))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

		Set<String> set = new TreeSet<>(new Comparator<>() {

			@Override
			public int compare(String o1, String o2) {
				int count1 = countVowels(o1);
				int count2 = countVowels(o2);

				if (count1 == count2) {
					return o1.compareTo(o2);
				}

				return count2 - count1;
			}

		});

		set.add("jayesh");
		set.add("rohit");
		set.add("satyam");
		set.add("tejas");
		set.add("kunal");

		set.add("aeiou");
		set.add("ario");
		set.add("aei");
		set.add("ae");
		set.add("a");

		for (String s : set) {
			System.out.println(s);
		}
	}
}
