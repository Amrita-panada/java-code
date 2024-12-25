public class constructure {
    public static void main(String[] args) {
       Student s1 =new Student(); 
       s1.name="Amrita";
       s1.roll=123;
       s1.password="xyz";
       s1.mark[0]=20;
       s1.mark[1]=40;
       s1.mark[2]=60;
       
       Student s2= new Student(s1);
       //System.out.println(s2.password);
       // System.out.println(s2.mark[0]);

        /*here we change mark of s1 after copy of s2 ,
          but still s2 change its marks,
          because it copy the reference
          so this is called *** Sallow COPY ***
        */
      /* s1.mark[0]=80;   case-2
       System.out.println(s2.mark[0]);*/

       //case-3
       s1.mark[0]=80;
       
       for(int i=0;i<3;i++){
          System.out.println(s2.mark[i]); //see no change in mark[0]
       }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int mark[]; /*if u r making array then u have to creat object in every construter 
                  to ensure that each cons. store same num of marks
                */

    Student(){     // non-parameter cons.
        mark=new int[3];
        System.out.println("constructer is called...");
    }

    Student(String name){   //parameter constructure
        mark=new int[3];
        this.name=name;
    }

    Student(int roll){
        mark=new int[3];
        this.roll=roll;
    }

    // this is copy constructure case-1(basics)
   /*  Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
        this.password=s1.password;
    } */

   // case-2 (shallow copy)
   /*Student(Student s1){
      this.name=s1.name;
      this.roll=s1.roll;
      this.password=s1.password;
      this.mark=s1.mark;
    } */

    //DEEP COPY case-3
    Student(Student s1){
        mark=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.password=s1.password;
        for(int i=0;i<mark.length;i++){
            this.mark[i]=s1.mark[i];
        }
      } 
}