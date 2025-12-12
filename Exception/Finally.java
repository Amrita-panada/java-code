public class Finally {
    public static void main(String[] args) {
        int a[]=new int[5];

        System.out.println("Hello");

        // try{
        //     System.out.println(a[8]);               //o/p:Hello
        // }finally{                                   //    i will run always
        //                                            //    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 5
        //     System.out.println("i will run always"); 
        // }


        try{
             System.out.println(a[8]);                   //o/p:Hello
                                                            // Exceptions Handled
        }catch(Exception e){                               //  i will run always
            System.out.println("Exceptions Handled");
        }
        finally{                                   
                                                    
            System.out.println("i will run always"); 
        }

    }
}
