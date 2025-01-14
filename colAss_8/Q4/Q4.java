import java.util.*;

class valueNotFoundException extends Exception{
    public valueNotFoundException(String message){
        super(message);
    }
}

public class Q4 {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc=new Scanner(System.in);
        while(true){
            try{
                System.out.println("enter a value");
                int v=sc.nextInt();
                boolean found=false;
                for(int[] row:arr){
                    for(int element:row){
                        if(element==v){
                            found=true;
                            break;
                        }
                    }
                }
                if(!found){
                    throw new valueNotFoundException("value not found");
                }
                System.out.println("value found");
                break;
            }
            catch(valueNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
