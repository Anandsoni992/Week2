import java.util.ArrayList;

// Course class
class Course {
    private String name;
    private ArrayList<Student> enrolledStudents;

    // Constructor to initialize course details
    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); // Associate course with student
        }
    }

    // Method to display students enrolled in the course
    public void displayEnrolledStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : enrolledStudents) {
            System.out.println("  " + student.getName());
        }
    }

    // Get course name
    public String getName() {
        return name;
    }
}

// Student class
class Student {
    private String name;
    private ArrayList<Course> courses;

    // Constructor to initialize student details
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to add a course (called internally by Course class)
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    // Method to view enrolled courses
    public void viewEnrolledCourses() {
        System.out.println("Courses for Student: " + name);
        for (Course course : courses) {
            System.out.println("  " + course.getName());
        }
    }

    // Get student name
    public String getName() {
        return name;
    }
}

// School class
class School {
    private String name;
    private ArrayList<Student> students;

    // Constructor to initialize school details
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Method to display all students in the school
    public void displayStudents() {
        System.out.println("Students in School: " + name);
        for (Student student : students) {
            System.out.println("  " + student.getName());
        }
    }
}

public class SchoolStudentsMain{
    public static void main(String[] args) {
        // Creating School object
        School school = new School("Green Valley High");

        // Creating Student objects
        Student student1 = new Student("Anand");
        Student student2 = new Student("Aakrati");
        Student student3 = new Student("Anshika");

        // Creating Course objects
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        // Adding students to the school (Aggregation)
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Enrolling students in courses (Association)
        math.enrollStudent(student1);
        math.enrollStudent(student2);
        science.enrollStudent(student1);
        science.enrollStudent(student3);
        history.enrollStudent(student2);

        // Displaying school students
        school.displayStudents();

        // Viewing courses for each student
        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();
        student3.viewEnrolledCourses();

        // Viewing students enrolled in each course
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
        history.displayEnrolledStudents();
    }
}
