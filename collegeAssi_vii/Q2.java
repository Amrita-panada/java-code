//Write a java program to input 10 integers from keyboard and store them into an array. Then find out how many of them are positive, how many are negative, how many are even and how many are odd


import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int pos=0,neg=0,even=0,odd=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

            if(arr[i]<0){
                neg++;
            }
            if(arr[i]>0){
                pos++;
            }
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("positive:"+pos);
        System.out.println("negetive"+neg);
        System.out.println("even:"+even);
        System.out.println("odd:"+odd);

    }
}
