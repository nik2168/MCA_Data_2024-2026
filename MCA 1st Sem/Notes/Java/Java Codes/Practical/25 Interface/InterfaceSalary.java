
 interface EmployeeSalary {
    public double calculateSalary();
}

class Developer implements EmployeeSalary {
    private double basicSalary;

    public Developer(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        // Developer has a bonus of 15% of the basic salary
        double bonus = basicSalary * 0.15;
        return basicSalary + bonus;  // Total salary = Basic Salary + Bonus
    }
}


public class InterfaceSalary {
    public static void main(String[] args) {
        Developer a = new Developer(130000);
        double salary = a.calculateSalary();
        System.out.println("Developer Salary :" + salary);
    }
}

// output
// Developer Salary :149500.0