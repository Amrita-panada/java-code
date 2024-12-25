public class LargestString {
    public static void main(String[] args) {
        String fruits[]={"apple","orange","Mango"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){   //i=1 because we taken largest=fruits[0]=apple
            // if(largest.compareToIgnoreCase( fruits[i])<0){
            //     largest=fruits[i];
            // }
            if(largest.compareTo(fruits[i] )<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
