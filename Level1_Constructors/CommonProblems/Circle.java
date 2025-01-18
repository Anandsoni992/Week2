class Circle {
    double radius;

    // Default Constructor
    Circle() {
        this(1.0); // Constructor Chaining
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to display the radius
    void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle parameterizedCircle = new Circle(5.5);

        defaultCircle.displayRadius();
        parameterizedCircle.displayRadius();
    }
}
