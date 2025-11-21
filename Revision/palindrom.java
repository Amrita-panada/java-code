import java.util.*;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while (temp>0) {
            int r=temp%10;
            rev=10*rev+r;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println("the num is palendrom");
        }else{
            System.out.println("Not palendrom");
        }
    }
}
