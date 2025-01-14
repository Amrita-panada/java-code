class salaryDatamissException extends Exception{
    public salaryDatamissException(String message){
        super(message);
    }
}

class Employee{
    String name;
    int ID;
    double[] monthlySal;
    public Employee(String name,int ID,double[] monthlySal){
        this.name=name;
        this.ID=ID;
        this.monthlySal=monthlySal;
    }

    public double calculateAnnualSalary() throws salaryDatamissException{
        double total=0;
        for(double salary:monthlySal){
            if(salary<=0){
                throw new salaryDatamissException("invalid or missing salary data:");
            }
            total+=salary;
        }
        return total;
    }
}



public class Q5 {
    public static void main(String[] args) {
        double[] salary={3000,2000,3000,3000,4000};
        Employee emp=new Employee("join doe",101,salary);
        try{
            System.out.println("annual salary:"+emp.calculateAnnualSalary());
        }
        catch(salaryDatamissException e){
            System.out.println(e.getMessage());
        }
    }
}
