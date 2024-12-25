import java.util.*;

public class Finding{
public static void PrintSubarray(int nums[]){
    int sum=0;
    for (int i=0;i<nums.length;i++){
       
        for(int j=i;j<nums.length;j++){
             sum=0;
            for(int k=i;k<=j;k++){
                sum=sum+nums[k];
                System.out.print(nums[k]+" ");
              
                
                
            }
           
            System.out.print("sum ="+sum);
            System.out.println();
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    int nums[] = {2,4,6,8,10};
    PrintSubarray( nums);
}
}