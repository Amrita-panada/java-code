public class Reverse {
    public static void Reverse(int nums[]){
        int first =0;
        int last=nums.length-1;
        while(first<last){
            int temp =nums[last];
            nums[last]=nums[first];
            nums[first]=temp;
           
            first++;
            last--;
        }
         for(int i=0;i<nums.length;i++){
                System.out.println(nums[i]+" ");
            }
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        Reverse( nums);
    }
}
