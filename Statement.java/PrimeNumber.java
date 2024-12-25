public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        int i=2;
        while(i<n){
            if (n%i==0) {
                continue;
            } 
    
           i++;
           System.out.println("prime"+n);
            
        }
        
    }
}
