/*14.wap to validate the given password
        i.pwd length should be minimum 8 ch
        2.pwd should contain atleast one upper
        3.pwd should contain atleast one lower
        4.there should be no char space
        5.password should contain atlist one special char*/

import java.util.*;
public class PwdValidation {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        String pwd=sc.nextLine();
        int upper=0;int lower=0;int space=0;int digit=0;int special=0;
        if(pwd.length()>=8 && pwd.length()<=15){
            for(int i=0;i<pwd.length();i++){
                char ch=pwd.charAt(i);
                if(Character.isUppercase(ch)){
                    upper++;
                }
                else if(Character.isLowercase(ch)){
                    lowerer++;
                }else if(Character.isWhitepsace(ch)){
                    space++;
                }else if(Character.isDigit(ch)){
                    digit++;
                }else{
                    special++;
                }
            }

            if(upper>0 && lower>0 && special==0 && digit>0 && special>0){
                System.out.println("valid password");
            }else{
                System.out.println("Invalid password");
            }
        }
    }
}
