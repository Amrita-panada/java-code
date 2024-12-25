import java.util.*;
public class Q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark=sc.nextInt();
        double a=23.546;
        System.out.printf("Your BMI is: %.2f\n", a);
        String gread;
        switch (mark/10) {
            case 10:
            case 9:
                gread="O";
                break;
               
            default:
                gread="F";
                break;
        }

        System.out.println(gread);
    }
 
}