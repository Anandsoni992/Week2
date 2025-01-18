class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter and Setter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
    }
}

public class Main {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "John", 9.0);
        pg.displayStudentDetails();
        pg.setCGPA(9.5);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
