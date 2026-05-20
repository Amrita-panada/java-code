import java.util.*;
public class CharProblem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        // //print ascii value of each char
        // for(int i=0;i<s.length();i++){
        //     System.out.println(s.charAt(i)+"="+(int)s.charAt(i));
        // }

        // //print only upper case char only 
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
            
        //     if(Character.isUpperCase(ch)){
        //         System.out.println(ch);

        //     }

        //     if(Character.isLowerCase(ch)){
        //         System.out.println(ch);

        //     }

        //     if(Character.isDigit(ch)){
        //         System.out.println(ch);

        //     }

        //     if(Character.isLetterorDigit(ch)){ //Alphabets
        //         System.out.println(ch);

        //     }
        
        // }

        // //count the uppercase count
        // int count=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
            
        //     if(Character.isUpperCase(ch)){
        //         System.out.println(ch);
        //         count++;

        //     }

        // }
        // System.out.println("number of upper case:"+count );


        //count a perticular char eg:R
        // int count=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     char ch2=Character.toUpperCase(ch); //count R and r
        //     if(ch2=='R'){
        //         //System.out.println(ch);
        //         count++;

        //     }

        // }
        // System.out.println("number of R in the string:"+count );

        //count all vowels
        // int count=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     char ch2=Character.toUpperCase(ch); //count R and r
        //     if(ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U'){
        //         //System.out.println(ch);
        //         count++;

        //     }

        // }
        // System.out.println("number of R in the string:"+count );

        //new string for only upper
        // String s2="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
            
        //     if(Character.isUpperCase(ch)){
        //         s2+=ch;

        //     }
        // }
        // System.out.println(s2);

        // //1st digit then char
        // String s2="";String s3="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
            
        //     if(Character.isDigit(ch)){
        //         s2+=ch;

        //     }
        //     else{
        //         s3+=ch;
        //     }

        // }
        // System.out.println(s2.concat(s3));
        
        // //upper then remaining
        // String s2="";String s3="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
            
        //     if(Character.isUpperCase(ch)){
        //         s2+=ch;

        //     }
        //     else{
        //         s3+=ch;
        //     }

        // }
        //   System.out.println(s2+s3);
        // System.out.println(s2.concat(s3));

        // //create a new string Removing all space
        // String s2="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
            
        //     if(ch!=' '){ //!Character.isWhitespace(ch)
        //         s2+=ch;

        //     }
            
        // }
        // System.out.println(s2);

        //reverse the  string
        // String s2="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
            
        //     s2=ch+s2;
        // }
        // System.out.println(s2);

        //reverse the case of a string
        // String s2="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
            
        //     if(Character.isUpperCase(ch)){
        //         s2+=Character.toUpperCase(ch);

        //     }
        //     else{
        //         s2+=Character.toLowerCase(ch);
        //     }

        // }
        // System.out.println(s2);

        // //palindrom
        // String s2="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
            
        //     s2=ch+s2;
        // }
        // if(s.equalsIgnoreCase(s2)){
        //     System.out.println("palindrom");
        // }else
        //     System.out.println("not palindrom");
    

    }
}
