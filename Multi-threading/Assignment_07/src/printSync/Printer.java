package printSync;

public class Printer {

	public void print(String header, String body, String footer) {
		try {
			System.out.print(header);
			Thread.sleep(800);
			System.out.print(body);
			Thread.sleep(800);
			System.out.print(footer);
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void printSync(String header, String body, String footer) {


		synchronized (this) {
			try {
				Thread.sleep(800);
				System.out.print(body);
				Thread.sleep(800);
				System.out.print(footer);
				Thread.sleep(800);
				System.out.print(header);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
