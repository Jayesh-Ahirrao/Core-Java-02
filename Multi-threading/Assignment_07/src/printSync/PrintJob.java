package printSync;

public class PrintJob implements Runnable {
	private Thread t;
	private Printer p;
	private String header;
	private String body;
	private String footer;

	public PrintJob(Printer p, String header, String body, String footer) {
		t = new Thread(this);
		this.p = p;
		this.header = header;
		this.body = body;
		this.footer = footer;
	}

	public void run() {
//		p.print(header, body, footer);
		p.printSync(header, body, footer);
	}

	public Thread getT() {
		return t;
	}
}
