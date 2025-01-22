import java.util.ArrayList;

// making a class book ATQ
class Book {
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters for title and author
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // To print book details
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}

// making a class library ATQ
class Library {
    private ArrayList<Book> books;

    // Constructor to initialize the books ArrayList
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks(int count) {
        System.out.println("Books in the Library "+count+" :"); 
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
//making a Main method 

public class LibraryBookMain {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("2024", "Anand Soni");
        Book book2 = new Book("2025", "Ankit patel");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Creating Library objects
        Library library1 = new Library();
        Library library2 = new Library();

        // Adding books to the libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3); 
	int count = 1; 

        // Displaying books in the libraries
        library1.displayBooks(count);
	count ++; 
        library2.displayBooks(count);
    }
}
