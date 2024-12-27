interface EmpInterface {
    void displayEmp();
    void giveBonus(double amount);
}

abstract class Employee {
    int empID;
    String fName, lName;
    double salary;

    Employee(int empID, String fName, String lName, double salary) {
        this.empID = empID;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }
}

class Manager extends Employee implements EmpInterface {
    double bonus;

    Manager(int empID, String fName, String lName, double salary) {
        super(empID, fName, lName, salary);
    }

    @Override
    public void displayEmp() {
        System.out.println("ID: " + empID + ", Name: " + fName + " " + lName + ", Salary: " + salary);
    }

    @Override
    public void giveBonus(double amount) {
        bonus = amount;
        salary += bonus;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        EmpInterface[] managers = new EmpInterface[2];
        managers[0] = new Manager(1, "John", "Doe", 50000);
        managers[1] = new Manager(2, "Jane", "Smith", 60000);

        for (EmpInterface emp : managers) {
            emp.displayEmp();
            emp.giveBonus(5000);
        }

        for (EmpInterface emp : managers) {
            emp.displayEmp();
        }
    }
}
