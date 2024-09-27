package jobs;

public class PrintJob implements Runnable {
	private Thread t;

	public PrintJob() {
		// TODO Auto-generated constructor stub
		t = new Thread(this);
	}

	public PrintJob(Runnable r) {
		// TODO Auto-generated constructor stub
		t = new Thread(r);
	}

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

	public Thread getT() {
		return t;
	}


}
