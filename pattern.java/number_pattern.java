public class number_pattern {
    public static void main(String[] args) {
        int total_row =5;
        int row =1;
        int star =1;
        int space =4;
        int num =1;
        while(row <= total_row){
           
            for(int i=1;i<=space;i++){
                
              System.out.print(" ");
               
            }
            for(int j=1;j<=star;j++){
                System.out.print(num+" ");
            }
            System.out.println();
            space--;
            star++;
            num++;
           row++;
        }
    }
}
