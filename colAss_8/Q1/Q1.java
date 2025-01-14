
class evenThread extends Thread{
    public void run(){
        for(int i=2;i<=20;i+=2){
            System.out.println("even:"+i);
        }
    }
}

class oddThread extends Thread{
    public void run(){
        for(int i=1;i<20;i+=2){
            System.out.println("odd"+i);
        }
    }
}

class squThread extends Thread{
    public void run(){
        for(int i=1;i<=20;i++){
            System.out.println("square:"+(i*i));
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Thread even=new evenThread();
        Thread odd=new oddThread();
        Thread sq=new squThread();

        //Q2 set different priority

        even.setPriority(Thread.MIN_PRIORITY);
        odd.setPriority(Thread.NORM_PRIORITY);
        sq.setPriority(Thread.MAX_PRIORITY);

        even.start();
        odd.start();
        sq.start();
    }
}
