package Library;

public class PaperBook extends Book {
	private int numberOfPages;
	private Date dateOfPublications;

	public PaperBook(int numberOfPages, Date dateOfPublications) {
		this.numberOfPages = numberOfPages;
		this.dateOfPublications = dateOfPublications;
	}

	public PaperBook() {
		numberOfPages = 0;
		dateOfPublications = new Date();
	}

	public PaperBook(String bookTitile, int numberOfPages, Date dateOfPublications) {
		super(bookTitile);
		// TODO Auto-generated constructor stub
		this.numberOfPages = numberOfPages;
		this.dateOfPublications = dateOfPublications;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Date of publications: " + dateOfPublications);
		System.out.println("Number of pages: " + numberOfPages);
	}

}
