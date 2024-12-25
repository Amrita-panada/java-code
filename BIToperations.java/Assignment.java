public class Assignment {
    public static void main(String[] args) {
        int x=3;
        int y=4;
        System.out.println("before swap: x="+x+"and y="+y);
        //swap using Xor
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap:x="+x+"and y="+y);
    }
}
  
  
    
