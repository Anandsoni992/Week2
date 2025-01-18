class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }
}

public class Main {
    public static void main(String[] args) {
        EBook ebook = new EBook("123-456-789", "Java Fundamentals", "James Gosling");
        ebook.displayDetails();
        ebook.setAuthor("Updated Author");
        ebook.displayDetails();
    }
}
