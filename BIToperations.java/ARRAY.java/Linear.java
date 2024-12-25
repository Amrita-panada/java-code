import java.util.*;

public class Linear {
    public static int Linear(int nums[],int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,12,14};
        int key =10;
        int index =Linear(nums, key);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("key is at index:"+index);
        }
    }
}
