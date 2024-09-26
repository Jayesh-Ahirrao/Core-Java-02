package list;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TwoDiamensionLists {

	public static int getSum(List<Integer> list) {
		int sum = 0;
		for (Integer num : list) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		List<List<Integer>> lists = new ArrayList<>();
		String line = null;
		System.out.println("Enter the input of arrays with space space separated integers, Enter 'stop' to end");

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			while (!(line = br.readLine()).equals("stop")) {
				List<Integer> list = new ArrayList<>();
				String[] inputArr = line.split(" ");

				for (int i = 0; i < inputArr.length; i++) {
					list.add(Integer.parseInt(inputArr[i]));
				}
				lists.add(list);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		int maxSum = 0;
		int maxIndex = 0;
		int sum = 0;
		for (int i = 0; i < lists.size(); i++) {
			sum = getSum(lists.get(i));
			if (sum > maxSum) {
				maxSum = sum;
				maxIndex = i;
			}

		}

		System.out.println("max sum: " + maxSum);
		System.out.println("max Index: " + maxIndex);
	}

}
