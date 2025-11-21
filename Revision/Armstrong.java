import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0){
            int r=temp%10;
            sum+=Math.pow(r, 3);
            temp/=10;
        }
        if(sum==num){
            System.out.println("amstrong number");
        }
        else{
            System.out.println("not amstrong");
        }
    }
}
