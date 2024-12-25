public class basicOperations {
    public static void main(String[] args) {
        int a=5,b=3;
        System.out.println("And operation:"+(a&b));
        System.out.println("NOR operation:"+(a^b));
        System.out.println("or operation:"+(a|b));
        System.out.println("complement of a:"+~a);
        System.out.println("left shift:"+(a<<b));
        System.out.println("right shift:"+(a>>b));
    }
}
