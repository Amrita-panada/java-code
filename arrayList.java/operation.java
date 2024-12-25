import java.util.ArrayList;

public class operation {
    public static void main(String[] args) {
        //classname objectName=new ClassName();
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();

        //add a  number 
        list.add(1);  //o(1)
        list.add(2);
        list.add(3);

        System.out.println(list);

        //Get operation ,index use to get a number
        int element=list.get(2);
        System.out.println(element);

        //remove
        list.remove(2);
        System.out.println(list);
    }
}
