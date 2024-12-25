public class Inverted_star_pattern {
    public static void main(String[] args) {
        int total_row =4;
        int row =1;
        int star = 4;
        while(row <= total_row){
            for(int i=0;i<star;i++){
                System.out.print("* ");
            }
            System.out.println();
            star--;
            row++;
        }
    }
}
