package job;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source file path");
		String source = sc.nextLine();
		System.out.println("Enter destination file path");
		String destination = sc.nextLine();

		CopyFileJob job = new CopyFileJob(source, destination);

		job.getT().start();

		try {
			job.getT().join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Job done");
	}
}
