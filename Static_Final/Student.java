class Student {
    // Static variable shared across all students
    static String universityName = "Global University";
    private static int totalStudents = 0; // Tracks the total number of students

    // Final variable for a unique roll number
    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor to initialize student details using 'this' keyword
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment the total student count
    }

    // Static method to display the total number of students
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Display student details, checking if the object is an instance of Student
    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");

        // Display student details and total students
        student1.displayDetails();
        student2.displayDetails();
        Student.displayTotalStudents();
    }
}
