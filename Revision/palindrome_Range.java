import java.util.Scanner;

public class palindrome_Range {
    public static Boolean is_palendrom(int x){
        int temp=x;
        int rev=0;
        while (temp>0) {
            int r=temp%10;
            rev=10*rev+r;
            temp=temp/10;
        }
        if(x==rev){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        //range
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        for(int i=1;i<=range;i++){
            if(is_palendrom(i)){
                System.out.println(i);
            }
        }
    }
}
