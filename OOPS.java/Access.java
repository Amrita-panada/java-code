public class Access {
    public static void main(String[] args) {
   
    
        students s1=new students();

        System.out.println(s1.getRoll());
        s1.name="amrita";
        System.out.println(s1.name);

    }
}


//constructors
class students{
    private int roll=23610;
    String name;
    public int getRoll() {
        return roll;
    }
     
}
