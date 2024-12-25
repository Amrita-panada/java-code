public class inharitance {
    public static void main(String[] args) {
       /* Fish shark=new Fish();
        shark.eat(); */

        dog d1= new dog();
        d1.eat();
        d1.legs=4;
        System.out.println(d1.legs);
    }
}

//BASE CLASS
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
}

//DERIVED CLASS 

//single levle
/*class Fish extends Animal{
    int fins;
}*/

//multi leavle
 class mamal extends Animal{
    int legs;
    void eat(){
        System.out.println("grass");
    }

 }

 class dog extends mamal{
    String bread;
    void eat(){
        System.out.println("meet");
    }
 }