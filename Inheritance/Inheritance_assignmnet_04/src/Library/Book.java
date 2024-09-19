package Library;


class Book {
    int bookId;
    String bookTitle; // association;
    float bookPrice;

    static int bookCount;

    public Book() {
        bookId = ++bookCount;
        bookTitle = "New Book";
        bookPrice = 100.0f;
    }

    public Book(String bookTitile) {
        this.bookTitle = bookTitile.trim();
        bookId = ++bookCount;
        bookPrice = 100.0f;
    }

    public void setPrice(float price) {
        this.bookPrice = price;
    }

    public void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book Price: " + bookPrice);
    }

    static {
        bookCount = 0;
    }
}
