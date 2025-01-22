import java.util.ArrayList;

// Employee class
class Employee {
    private String name;
    private String position;

    // Constructor to initialize employee details
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Method to display employee details
    @Override
    public String toString() {
        return "Employee Name: " + name + ", Position: " + position;
    }
}

// Department class
class Department {
    private String name;
    private ArrayList<Employee> employees;

    // Constructor to initialize department details
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display department details
    public void displayDepartment() {
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
            System.out.println("	" + employee);
        }
    }
}

// Company class
class Company {
    private String name;
    private ArrayList<Department> departments;

    // Constructor to initialize company details
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display company details
    public void displayCompany() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayDepartment();
        }
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        // Creating Company object
        Company company = new Company("Capgemini");

        // Creating Department objects
        Department dept1 = new Department("Research and Development");
        Department dept2 = new Department("Human Resources");

        // Creating Employee objects and adding them to departments
        dept1.addEmployee(new Employee("Anand", "Research Scientist"));
        dept1.addEmployee(new Employee("Anshika", "Data Analyst"));

        dept2.addEmployee(new Employee("Aannya", "HR Manager"));
        dept2.addEmployee(new Employee("Aakrati", "Recruiter"));

        // Adding departments to the company
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Displaying company details
        company.displayCompany();

        // Deleting the company
        // In Java, garbage collection will automatically delete all associated objects
        company = null;
        System.out.println("\nCompany and all associated departments and employees are deleted.");
    }
}
