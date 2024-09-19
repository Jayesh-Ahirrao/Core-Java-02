package extras;

public class Main {
	public static int getIndexOf(int key, int[] arr) {
		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				index = i;
			}
		}

		return index;
	}

	public static void main(String[] args) {

		int arr[] = new int[args.length - 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}

		int index = getIndexOf(Integer.parseInt(args[args.length - 1]), arr);

		if(index  < 0) {
			System.out.println("Element not present in the array");
		}else {
			System.out.println("Element preent at index " + index);
		}
	}
}
