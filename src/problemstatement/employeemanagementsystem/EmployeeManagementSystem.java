package problemstatement.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employees
        Employee fullTimeEmployee = new FullTimeEmployee(101, "John Doe", 50000, 10000);
        Employee partTimeEmployee = new PartTimeEmployee(102, "Jane Smith", 30000, 20, 100);

        // Department details
        EmployeeDepartment department = new EmployeeDepartment();
        department.assignDepartment("Human Resources");

        // Displaying employee details and department
        System.out.println("Full-Time Employee Details:");
        fullTimeEmployee.displayDetails();
        System.out.println(department.getDepartmentDetails());

        System.out.println("\nPart-Time Employee Details:");
        partTimeEmployee.displayDetails();
        System.out.println(department.getDepartmentDetails());
    }
}