package Library;

public class Ebook extends Book {
	private String downloadURL;
	private double sizeInMBs;

	public Ebook(String bookTitile, String downloadURL, double sizeInMBs) {
		super(bookTitile);
		this.downloadURL = downloadURL;
		this.sizeInMBs = sizeInMBs;
	}

	public Ebook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ebook(String downloadURL, double sizeInMBs) {
		super();
		this.downloadURL = downloadURL;
		this.sizeInMBs = sizeInMBs;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Download URL: " + downloadURL);
		System.out.println("Size in MBs: " + sizeInMBs);
	}
}
