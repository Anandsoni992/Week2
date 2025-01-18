class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book parameterizedBook = new Book("Java Programming", "James Gosling", 500.0);

        defaultBook.displayDetails();
        parameterizedBook.displayDetails();
    }
}
