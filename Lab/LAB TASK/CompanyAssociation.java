package Lab;

// -------------------- POSITION --------------------
class Position {
    private String title;
    private double salary;

    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public void showPosition() {
        System.out.println("Position: " + title);
        System.out.println("Salary: " + salary);
    }
}

// -------------------- EMPLOYEE --------------------
class Employee {
    private String name;
    private Position position;   

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void showEmployee() {
        System.out.println("Employee Name: " + name);
        position.showPosition();
    }
}

// -------------------- COMPANY --------------------
class Company {
    private String companyName;
    private Employee[] employees;
    private int count = 0;

    public Company(String companyName, int size) {
        this.companyName = companyName;
        employees = new Employee[size]; 
    }

    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count] = e;
            count++;
        } else {
            System.out.println("Cannot add more employees");
        }
    }

    public void showEmployees() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee List:");
        for (int i = 0; i < count; i++) {
            employees[i].showEmployee();
            System.out.println();
        }
    }
}

// -------------------- MAIN --------------------
public class CompanyAssociation {
    public static void main(String[] args) {

        Company company = new Company("TechSoft Ltd.", 2);

        Position p1 = new Position("Software Engineer", 60000);
        Employee e1 = new Employee("Yamin", p1);

        Position p2 = new Position("Project Manager", 90000);
        Employee e2 = new Employee("Seikh", p2);

        company.addEmployee(e1);
        company.addEmployee(e2);

        company.showEmployees();
    }
}