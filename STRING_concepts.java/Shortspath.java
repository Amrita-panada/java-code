public class Shortspath{
    public static float Shortspath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='e'){
                x++;
            }else if(dir=='w'){
                x--;
            }else if(dir=='n'){
                y++;

            }else{
                y--;
            }
         
        }
        int x2=x*x;        
         int y2=y*y;         
      float distance=(float)Math.sqrt(x2+y2);
        return distance;
    }
    public static void main(String[] args) {
        String path="weesnnweeen";
        System.out.println(Shortspath(path));
    }
}
 
    

