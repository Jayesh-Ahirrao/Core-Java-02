package job;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileJob implements Runnable {
	Thread t;
	String source;
	String destination;

	public CopyFileJob(String source, String destination) {
		super();
		this.t = new Thread(this);
		this.source = source;
		this.destination = destination;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// read from source file
		// write to destination file
		transferData(source, destination);
	}

	public void transferData(String source, String destinamtio) {
		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(source));
				BufferedWriter bw = new BufferedWriter(new FileWriter(destination))) 
		{
			while ((line = br.readLine()) != null) {
				bw.write(line);
				System.out.println(line);
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public Thread getT() {
		return t;
	}

	public void setT(Thread t) {
		this.t = t;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
