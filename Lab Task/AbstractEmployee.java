public class AbstractEmployee {
abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void showDetails() {
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee emp = new FullTimeEmployee("Alif", 30000);

        emp.showDetails();
        System.out.println("Salary: " + emp.calculateSalary());
    }
}
}
