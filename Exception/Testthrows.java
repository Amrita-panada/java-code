import java.io.*;
class ThrowsClass{
	void method1()throws IOException{
		throw new IOException("device error");
	} 
}
public class Testthrows{
	public static void main(String args[]){
	try{
	     ThrowsClass  tc=new ThrowsClass();
	     tc.method1();
	}
	catch(Exception e){
	     System.out.println("exception handled");}
		System.out.println("normal flow...");
    }
}