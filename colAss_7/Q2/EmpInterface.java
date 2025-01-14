
public interface  EmpInterface{
    void display();
    void giveBonus(double amount); 
    
}

abstract class Employee {
   int empid;
    String fn,ln;
    double salary;
    Employee(int empid,String fn,String ln,double salary){
        this.empid=empid;
        this.fn=fn;
        this.ln=ln; 
        this.salary=salary;
    }
    
}

class manager extends Employee implements EmpInterface{
    double bonus;
    manager(int empid,String fn,String ln,double salary){
        super(empid,fn,ln,salary);
    }
    public void display(){
        System.out.println("Employee ID: "+empid);
        System.out.println("First Name: "+fn);
        System.out.println("Last Name: "+ln);
        System.out.println("Salary: "+salary);
    }
    public void giveBonus(double amount){
        bonus=amount;
        System.out.println("Bonus: "+bonus);
    }
}
public class Q2 {
    public static void main(String[] args) {
        manager[] managers={new manager(101, "john", "smith", 500);
            new manager(101, "ami", "panda", 6000)
         };
        
        for(manager manager:managers){
            manager.display();
            manager.giveBonus(500);
        }
    }
}
