package jobs;

public class PrintJob implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread curr = Thread.currentThread();
		for (int i = 1; i < 6; i++) {
			System.out.println("From " + curr.getName() + " Element: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
