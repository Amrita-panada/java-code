import java.util.*;
public class Qsp_qs {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        String s=sc.nextLine();

        // //palendrom
        // String rev="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     rev=ch+rev;
        // }
        // if(rev==s){
        //     System.out.println("palendrom");

        // }else{
        //     System.out.println("not palendrom");

        // }


        // //upper  case using method 
        // String upperStr=s.toUpperCase();
        // System.out.println(upperStr);

        // //upper case not using uppercase method
        // String upperStr="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     upperStr+=Character.toUpperCase(ch);
        // }
        // System.out.println(upperStr);

        // //or
        // String s2="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch>='a' && ch<='z'){ // if i write || it give op:Amrita =!MRITA
        //         s2+=(char) (ch-32);
        //     }else{
        //         s2+=ch;
        //     }
        // }
        // System.out.println(s2);

        // //upper to lower
        // String s2="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch>='A' && ch<='Z'){ 
        //         s2+=(char) (ch+32);
        //     }else{
        //         s2+=ch;
        //     }
        // }
        // System.out.println(s2);


        // //count vowel and consonant
        // String s2="";int v_count=0;int c_count=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     char c=Character.toUpperCase(ch);
        //     if(c>='A' || c<='E'||c>='I' ||c>='O' ||c>='U' ){ 
        //         v_count++;
        //     }else{
        //         c_count++
        //     }
        // }
        // System.out.println("number of vowel"+v_count);
        // System.out.println("number of consonant"+c_count);


        // //count digit
        // int c=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
            
        //     if(ch>='0'&& ch<='9' ){ 
        //         c++;
        //     }
        // }
        // System.out.println("number of digit"+c);


        // //sum of all didgit
        // int sum=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
            
        //     if(ch>='0'&& ch<='9' ){ 
        //         sum+=(int)ch-48; //if we only write sum+=ch it will add ascii values
        //         //sum+=Character.toDigits(ch);
        //     }
        // }
        // System.out.println("sum of digit: "+sum);


        // //write to remove all the spaces using split
        // String words[]=s.split(" ");
        // String newString="";
        // for(int i=0;i<words.length;i++){
        //     newString+=words[i];
        // }

        // System.out.println("new string: "+newString);
        String words[]=s.split(" ");
        String newString="";
        for(int i=0;i<words.length;i++){
            newString=newString+"@"+words[i];
        }
        System.out.println("new string: "+newString);
    }
}
