public class Binomial {
    //1st creat factorial code
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){   //n!=1*2*3...n
            f = f*i;
        }
       
        
        return f;
    }
    // main funtion use only one time
    // 2nd part creat binomial
    public static int Binomial(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nMr =factorial(n-r);
        int Binomial = fact_n /(fact_r*fact_nMr); // n!/r!(n-r)!
        return Binomial;
    }
    public static void main(String[] args) {
        System.out.println(Binomial(5, 3));
    }

}
