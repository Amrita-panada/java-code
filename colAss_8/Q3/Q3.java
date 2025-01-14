class invalidAgeException extends Exception{
    public invalidAgeException(String message){
        super(message);
    }
}

public class Q3 {
    public static void main(String[] args) {
        try{
            int age=19;
            if(age<18){
                throw new invalidAgeException("Age must be 18 above");
            }
        }
        catch(invalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
