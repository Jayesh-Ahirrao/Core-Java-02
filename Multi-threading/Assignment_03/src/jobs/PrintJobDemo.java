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
		
		
		PrintJob job2 = new PrintJob(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for (int i = 1; i < 6; i++) {
					System.out.println(i);
				}

			}
		});

		job1.getT().start();
		job2.getT().start();

		System.out.println("End of main method");
	}
}
