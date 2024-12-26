
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int Fst_Largest=Integer.MIN_VALUE;
        int snd_Largest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>Fst_Largest){
                snd_Largest=Fst_Largest;
                Fst_Largest=arr[i];
            }else if(arr[i]>snd_Largest && arr[i]<Fst_Largest){
                snd_Largest=arr[i];
            }

        }
        System.out.println("secondlargest num:"+snd_Largest);
    }
}
