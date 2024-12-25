public class Substring {
    public static String Substring(String n){
        int start=0;
        int end=3;
        String subString="";
        for(int i=start;i<=end;i++){
            subString+=n.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        String n="amrita panda";
        String subString=n.substring(1, 3);
        System.out.println(subString);
      //  System.out.println(Substring(n));
    }
}
