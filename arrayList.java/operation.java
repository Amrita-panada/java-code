import java.util.ArrayList;

public class operation {
    public static void main(String[] args) {
        //classname objectName=new ClassName();
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        
        //add a  number 
        list.add(1);  //o(1)
        list.add(2);
        list.add(30);
        list.add(40);
        list.add(5);
        list.add(68);
        list.add(75);

        System.out.println(list);

        list.add(1,50);//this will add 50 at index 1
        System.out.println(list);

        //Get operation ,index use to get a number
        int element=list.get(2);
        System.out.println(element); 

        ArrayList<Integer>list3=new ArrayList<>();
        list3.add(150);
        list3.add(160);

        list.addAll(list3); //this will add all element of list3 with list1
        System.out.println(list);

        //remove= this will remove the value in the index
        list.remove(2); // this is the index
        System.out.println(list);
        list.remove(Integer.valueOf(30)); //this is another why to remove

        list3.clear(); //this will remove all the element from the list
    
        //to set new value 
        list.set(2,1000); //here 2 is index and 1000 is the neew value

        list.contains(50); //output true or false

        //different type of for loops
        for(int i=0;i<list.size();i++){
            System.out.println("the element is"+list.get(i));
        }

        for(Integer element:list){
            System.out.println("the foreach loop"+element);
        }

        Iterator<Integer> it=list.iterator();

        while(it.hasNext()){
            System.out.println("iterator"+it.next());
        }
    }
}
