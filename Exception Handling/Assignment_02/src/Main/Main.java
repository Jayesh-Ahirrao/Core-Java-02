package Main;
import java.util.*;

public class Main {

	static int [] acceptArray(int size , Scanner sc) throws NumberFormatException {
		int arr[] = new int[size];
		System.out.println("Enter elements: ");
		for(int i = 0 ; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	
	public static void main(String [] args) {
		int size ;
		int index;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements \t");
		try {
			size = sc.nextInt();
			int arr[] =  acceptArray(size, sc);
			System.out.println("Enter the index of element you want to access");
			index = sc.nextInt();
			System.out.println(arr[index]);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
