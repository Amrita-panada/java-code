import java.util.*;
public class HMap {
    public static void main(String[] args) {
        //country(key),population(value)
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);

        //it can update the value
        map.put("China",180);
        System.out.println(map);

        // //Search
        // if(map.containsKey("India")){
        //     System.out.println("key is present");
        // }else{
        //     System.out.println("key is not present");
        // }

        System.out.println(map.get("China"));
        System.out.println(map.get("pak"));

        //Iteration
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //remove 
        map.remove("China");
    }
}
