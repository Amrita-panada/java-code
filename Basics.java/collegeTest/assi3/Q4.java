public class Q4 {
    public static void main(String[] args) {
        if(args.length!=3){
            System.out.println("provide 3 length");
        }
        int n1= Integer.parseInt(args[0]);
        int n2= Integer.parseInt(args[1]);
        int n3=Integer.parseInt(args[2]);
        
        if(n1==n2 && n2==n3){
            System.out.println("equal");
        }else{
            System.out.println("not");
        }
    }
}
