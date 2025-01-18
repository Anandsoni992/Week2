class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: $" + getSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(101, "HR", 70000.0);
        manager.displayDetails();
        manager.setSalary(75000.0);
        System.out.println("Updated Salary: $" + manager.getSalary());
    }
}
