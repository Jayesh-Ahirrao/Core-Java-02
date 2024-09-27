package job;

public class PrimeRangeJob implements Runnable {
	private Thread t;
	private int start;
	private int end;

	public PrimeRangeJob(int start, int end) {
		super();
		this.t = new Thread(this);
		this.start = start;
		this.end = end;
	}

	public Thread getT() {
		return t;
	}

	public void setT(Thread t) {
		this.t = t;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.println(i + " is prime");
			}
		}

	}

	private boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
