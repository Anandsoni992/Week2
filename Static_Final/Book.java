class Book {
    // Static variable shared by all books
    static String libraryName = "City Library";

    // Final variable for a unique book identifier
    private final String isbn;
    private String title;
    private String author;

    // Constructor to initialize book details using 'this' keyword
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Display book details, checking if the object is an instance of Book
    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("1984", "George Orwell", "12345");
        Book book2 = new Book("Brave New World", "Aldous Huxley", "67890");

        // Display library name and book details
        Book.displayLibraryName();
        book1.displayDetails();
        book2.displayDetails();
    }
}
