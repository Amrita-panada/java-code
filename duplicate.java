import java.util.ArrayList;
import java.util.List;

public class duplicate {

    public static void findDuplicate(List<Integer>list){
        int count=0;
        for(int i=0;i<list.size();i++){
            count=0;
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    count++;
                }
               
            }
            if(count>1){
                System.out.println(list.get(i));
            }
        }
        
    }
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        

        findDuplicate(list);
    }
}
