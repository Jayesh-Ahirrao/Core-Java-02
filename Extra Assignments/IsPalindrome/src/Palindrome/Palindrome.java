package Palindrome;

import java.util.Scanner;

public class Palindrome {
	static boolean isPalindrome(String str){
		int len = str.length();
		for(int i = 0; i < len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) {
				return false;
			}
		}
		
		return true;
		
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		System.out.println(isPalindrome(str));
		
		sc.close();
	}
}
