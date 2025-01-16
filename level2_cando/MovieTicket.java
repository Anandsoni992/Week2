class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    boolean isBooked;

    // Constructor to initialize ticket details
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for seat: " + seatNumber);
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", "A12", 300.0);
        ticket.displayDetails();
        ticket.bookTicket();
        ticket.displayDetails();
        ticket.bookTicket(); // Attempt to book again
    }
}
