class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Institute"; // Class variable

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " months, Fee: $" + fee);
    }

    // Class method
    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 500.0);
        Course c2 = new Course("Python Programming", 2, 400.0);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
        System.out.println("Institute Name: " + Course.instituteName);

        Course.updateInstituteName("Advanced Tech Institute");
        System.out.println("Updated Institute Name: " + Course.instituteName);
    }
}
