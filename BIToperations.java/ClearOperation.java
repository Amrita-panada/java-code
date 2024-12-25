public class ClearOperation{
    public static int ClearFromIthBit(int n,int i){
        int Bitmask= ~0<<i;
        return n&Bitmask;
    }
    public static int ClearRangeOfBit(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static void main(String[] args) {
      //  System.out.println(ClearFromIthBit(15, 2));
        System.out.println(ClearRangeOfBit(10, 2,4));
    }
}
    
