//Union of 2 arrays
import java.util.*;
public class Union {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        int l1=arr1.length;
        int l2=arr2.length;

        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<l1;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<l2;i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
}
