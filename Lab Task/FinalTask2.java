public class FinalTask2 {
class Position {
    String title;
    double salary;

    Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }
}


class Employee {
    String name;
    Position position;

    Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }
}
class Company {
    String companyName;
    Employee[] employees;   
    int count;

    Company(String companyName, int size) {
        this.companyName = companyName;
        employees = new Employee[size];
        count = 0;
    }

    void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count] = e;
            count++;
        }
    }

    void display() {
        System.out.println("Company: " + companyName);
        for (int i = 0; i < count; i++) {
            System.out.println("Employee Name: " + employees[i].name);
            System.out.println("Position: " + employees[i].position.title);
            System.out.println("Salary: " + employees[i].position.salary);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Company company = new Company("MAcrodev", 5);

        Position p1 = new Position("Software Engineer", 60000);
        Position p2 = new Position("Project Manager", 80000);

        Employee e1 = new Employee("Alif", p1);
        Employee e2 = new Employee("Kabbo", p2);

        company.addEmployee(e1);
        company.addEmployee(e2);

        company.display();
    }
}
}
