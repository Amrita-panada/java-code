import java.util.*;
public class WordProblems {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w="";s+=" ";

        // //getting each words
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch!=' '){
        //         w+=ch;
        //     }
        //     else{
        //         System.out.println(w);
        //         w="";
        //     }
        // }


        // //print 1st char of each word
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch!=' '){
        //         w+=ch;
        //     }
        //     else{
        //         System.out.println(w.charAt(0));
        //         w="";
        //     }
        // }


        // //print the 1st 2 char of each word in a sentence
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch!=' '){
        //         w+=ch;
        //     }
        //     else{
        //         System.out.println(w.substring(0,2));
        //         w="";
        //     }
        // }


        // //print only the words string with R in a Sentence
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch!=' '){
        //         w+=ch;
        //     }
        //     else{
        //         if(w.charAt(0)=='R' || w.charAt(0)='r'){ //or we can also write if(w.startsWith("R"))
        //             System.out.println(w);
        //         }
                
        //         w="";
        //     }
        // }


        // //print only the words ending with ED in a sentence
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch!=' '){
        //         w+=ch;
        //     }
        //     else{
        //         if(w.endsWith("ED")){
        //             System.out.println(w);
        //         }
                
        //         w="";
        //     }
        // }

        // //print only the words containing E in a sentence
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch!=' '){
        //         w+=ch;
        //     }
        //     else{
        //         if(w.contains("E")){
        //             System.out.println(w);
        //         }
                
        //         w="";
        //     }
        // }


        // //print only words having 3 char in a sentence
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch!=' '){
        //         w+=ch;
        //     }
        //     else{
        //         if(w.length()==3){
        //             System.out.println(w);
        //         }
                
        //         w="";
        //     }
        // }


        // //print all special word eg:Anna ,bob
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch!=' '){
        //         w+=ch;
        //     }
        //     else{
        //             char F=w.charAt(0);
        //             char E=w.charAt(w.length()-1);
        //         if(F==E){ //if(Character.toUpperCase(F)==Character.toUpperCase(E))
        //             System.out.println(w);
        //         }
                
        //         w="";
        //     }
        // }

        // //Find the longest word in a sentence
        // String LW="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch!=' '){
        //         w+=ch;
        //     }
        //     else{

        //         if(w.length()>LW.length()){
        //             LW=W;
        //         }
                
        //         w="";
        //     }
        //     System.out.println("longest word"+LW);
        // }



        // //find if the word OR exist in String
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch!=' '){
        //         w+=ch;
        //     }
        //     else{

        //         if(w.contains("OR")){
        //             System.out.println(w);
        //         }
                
        //         w="";
        //     }
            
        // }


        //count the num of words in a sentence
    }
}
