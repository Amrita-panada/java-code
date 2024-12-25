public class pair {
    
    public static void pair(int num[]){
        int current,i,j;
        for(i=0;i<num.length;i++){
            current=num[i];
            for(j=i+1;j<num.length;j++){
                System.out.print("("+current+","+num[j]+")");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int num[]={2,3,4,5,6};
        pair(num);
    }
}
   