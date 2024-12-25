public class Rain_water {
    public static int Find(int nums[]){
        int start=0; int key=10;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==key){
                return mid;
            }else if(nums[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        

    
    
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,12};
        System.out.println("number is: "+Find(nums));
    }
}

    
        

