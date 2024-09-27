package main;

public class MainThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();

		System.out.println("Name of default: \t\t" + mainThread.getName());
		System.out.println("Priority of default thread: \t" + mainThread.getPriority());
	}

}
