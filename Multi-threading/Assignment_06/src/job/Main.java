package job;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start of the range");
		int start = sc.nextInt();

		System.out.println("Enter end of the range");
		int end = sc.nextInt();

		PrimeRangeJob job = new PrimeRangeJob(start, end);
		job.getT().start();

		System.out.println("End of mian");
	}
}
