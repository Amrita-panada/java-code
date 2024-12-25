public class basics {
    public static void main(String args[]){
      Pen p1=new Pen();
      p1.Setcolour("blue");
      System.out.println(p1.colour);  
    }

}
class Pen{
    String colour;
    int tip;
    void Setcolour(String newcolour){
        colour=newcolour;
    }
    void Settip(int newtip){
        tip=newtip;
    }
}