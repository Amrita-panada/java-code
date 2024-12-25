import java.util.*;
public class User_input_vowles {
    public static int count_vowles(String str){
        int count=0;
        
        for(int i=0;i<str.length();i++){
           if((str.charAt(i)=='a')||(str.charAt(i)=='e')){
            count++;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(count_vowles(str));
    }
}
