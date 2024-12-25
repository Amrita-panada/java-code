import java.util.*;
public class Basic{
    public static void Letter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static boolean palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
     //    String first="amrita";
     //    String last="panda";
     //    String Fullname=first+" "+last;
        //    Letter(Fullname);
    //  String s="ShradhaDidi";
    //  String s2="ApnaCollege";   
    //    // System.out.println(palindrome(s));
    //  String s3=new String("ShradhaDidi");
    //  if(s.equals(s2)){
    //     System.out.println("equal");
    //  }else{
    //     System.out.println("not equal");
    //  }
    //  if(s.equals(s3)){
    //     System.out.println("equal");
    //  }else{
    //     System.out.println("not equal");
    //  }  
       // System.out.println(s.equals(s3)+"  "+s.equals( s2));
       String N="AmritaPanda".replace("2"," ");
       System.out.println(N);
    }

}