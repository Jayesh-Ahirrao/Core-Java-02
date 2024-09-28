package printSync;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer();

		PrintJob pJob1 = new PrintJob(p, "(", "Rhoit", ")");
		PrintJob pJob2 = new PrintJob(p, "[", "Jayesh", "]");
		PrintJob pJob3 = new PrintJob(p, "{", "Satyam", "}");

		pJob1.getT().start();
		pJob2.getT().start();
		pJob3.getT().start();
	}

}
