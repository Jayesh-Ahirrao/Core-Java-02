package jobs;

public class CountFromN implements Runnable {
	private Thread t;
	private int number;

	public CountFromN() {
		// TODO Auto-generated constructor stub
		t = new Thread(this);
		number = 50;
	}

	public CountFromN(int number) {
		// TODO Auto-generated constructor stub
		t = new Thread(this);
		this.number = number;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread curr = Thread.currentThread();
		for (int i = number; i > 0; i--) {
			
			System.out.println("From " + curr.getName() + " Element: " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public Thread getT() {
		return t;
	}

}
