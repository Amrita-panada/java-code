public class DuplicatesArr {

    public static boolean Duplicate(int[] arr,int n,int k){
        for(int i=0;i<n;i++){
            int j=i+1;
            int range=n;
        
         while (range>0 && j<n) {
            if(arr[i]==arr[j]){
                return true;
            }
             j++;
             range--;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1};
        int n=arr.length;
        int k=1;
        if(Duplicate(arr,n,k)==true){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
