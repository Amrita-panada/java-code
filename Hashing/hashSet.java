import java.util.HashSet;
import java.util.Iterator;
public class hashSet {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<Integer> set=new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3); 
        set.add(1);

        //SIZE
        System.out.println("Size of set is: "+set.size());

        //Display
        System.out.println("HashSet: "+set);//print all elements

        //Search
        if(set.contains(1)){
            System.out.println("1 is present");
        }
        if(!set.contains(4)){
            System.out.println("4 is not present");
        }
        else{
            System.out.println("1 is not present");
        }

        //Delete
        set.remove(2);
        if(!set.contains(2)){
            System.out.println("2 is not present-I deleted it");
        }
        else{
            System.out.println("2 is present");
        }

        //Iterate
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
