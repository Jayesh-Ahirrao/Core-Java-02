package Library;

public class Main {
	public static void main(String[] args) {
		Book b1 = new PaperBook();
		Book b2 = new Ebook();
		
		b1.display();
		b2.display();
	}
}
