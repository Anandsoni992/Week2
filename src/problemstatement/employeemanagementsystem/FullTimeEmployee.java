package problemstatement.employeemanagementsystem;

class FullTimeEmployee extends Employee {
    private double annualBonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double annualBonus) {
        super(employeeId, name, baseSalary);
        this.annualBonus = annualBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + annualBonus;
    }
}

