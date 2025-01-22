import java.util.ArrayList;

// Faculty class
class Faculty {
    private String name;

    // Constructor to initialize faculty details
    public Faculty(String name) {
        this.name = name;
    }

    // Method to display faculty details
    @Override
    public String toString() {
        return "Faculty Name: " + name;
    }
}

// Department class
class Department {
    private String name;
    private ArrayList<Faculty> faculties;

    // Constructor to initialize department details
    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    // Method to add a faculty to the department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Method to display department details
    public void displayDepartment() {
        System.out.println("Department: " + name);
        for (Faculty faculty : faculties) {
            System.out.println("  " + faculty);
        }
    }
}

// University class
class University {
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    // Constructor to initialize university details
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Method to add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to add a faculty to the university (aggregation)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Method to display university details
    public void displayUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartment();
        }
        System.out.println("Independent Faculty Members:");
        for (Faculty faculty : faculties) {
            System.out.println("	" + faculty);
        }
    }

    // Deleting the university
    public void deleteUniversity() {
        System.out.println("\nDeleting University: " + name);
        departments.clear(); // Removes all departments
        faculties.clear(); // Faculties still exist outside the university
        System.out.println("All departments removed, but faculty members can still exist independently.");
    }
}

public class UniversityFacultyDepartmentsMain {
    public static void main(String[] args) {
        // Creating University object
        University university = new University("Global Tech University");

        // Creating Faculty objects
        Faculty faculty1 = new Faculty("Dr. Alice");
        Faculty faculty2 = new Faculty("Dr. Bob");
        Faculty faculty3 = new Faculty("Dr. Charlie");

        // Adding faculties directly to the university (aggregation)
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Creating Department objects
        Department csDept = new Department("Computer Science");
        Department bioDept = new Department("Biology");

        // Adding faculty to departments
        csDept.addFaculty(faculty1); // Dr. Alice belongs to CS
        csDept.addFaculty(faculty3); // Dr. Charlie belongs to CS
        bioDept.addFaculty(faculty2); // Dr. Bob belongs to Biology

        // Adding departments to the university (composition)
        university.addDepartment(csDept);
        university.addDepartment(bioDept);

        // Displaying university details
        university.displayUniversity();

        // Deleting the university
        university.deleteUniversity();
    }
}
