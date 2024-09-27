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

public class CountToNDemo {
	public static void main(String[] args) {

		System.out.println("start of main method");

		CountFromN job1 = new CountFromN();
		CountFromN job2 = new CountFromN(10);
		CountFromN job3 = new CountFromN(80);

		job1.getT().setName("CCCCCCCCC");
		job2.getT().setName("BBBBBBBBB");
		job3.getT().setName("AAAAAAAAA");

		job1.getT().start();
		job2.getT().start();
		job3.getT().start();

		System.out.println("End of main method");
	}
}
