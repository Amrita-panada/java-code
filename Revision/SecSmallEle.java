public class SecSmallEle {
    public static void main(String[] args){
        int arr[]={2,4,3,7,9};
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            small=Math.min(small,arr[i]);   
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<second_small && arr[i]!=small){
                second_small=arr[i];
            }
        }
        System.out.println(second_small);
    }
}
