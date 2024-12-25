public class sum_digits {
    public static void main(String[] args) {
        int r,n=628326,sum=0,product=1;
        while(n>=0){
            r= n%10;
            sum+=r;
            product*=r;
            n/=10;
        }
        System.out.println("sum of digits is"+sum+" and product is:"+product);
    }
}
