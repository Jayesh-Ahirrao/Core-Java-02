package jobs;

/*
start of main method
End of main method
From Thread-1 Element: 1
From Thread-0 Element: 1
From Thread-0 Element: 2
From Thread-1 Element: 2
From Thread-0 Element: 3
From Thread-1 Element: 3
From Thread-0 Element: 4
From Thread-1 Element: 4
From Thread-1 Element: 5
From Thread-0 Element: 5
 
 */

public class PrintJobDemo {
	public static void main(String[] args) {

		System.out.println("start of main method");
		PrintJob job1 = new PrintJob();
		
		Thread t1 = new Thread(job1);

		PrintJob job2 = new PrintJob();
		Thread t2 = new Thread(job2);

		t1.start();
		t2.start();

		System.out.println("End of main method");
	}
}
