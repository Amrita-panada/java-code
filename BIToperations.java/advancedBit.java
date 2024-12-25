public class advancedBit {
   public static int GetIthBit(int n,int i){
    int Bitmask=1<<i;
    if((n&Bitmask)==0){
        return 0;
    }else{
        return 1;
    }
   }
    public static int SetIthBit(int n,int i){
        int Bitmask=1<<i;
       return (n | Bitmask) ;
        
    }
    public static int ClearithBit(int n,int i){
        int Bitmask=1<<i;
        int complement = ~Bitmask;
        return n&complement;
    }
    public static int UpdateIthBit(int n,int i,int newbit){
        if(newbit==0){
            return ClearithBit(n,i);
        }else{
            return GetIthBit(n,i);
        }
    }

    public static void main(String[] args) {
       // System.out.println(SetIthBit(10, 2));
      // System.out.println(ClearithBit(15, 2));
     // System.out.println(GetIthBit(10, 2));
     System.out.println(UpdateIthBit(15, 2, 0));
    }
}
