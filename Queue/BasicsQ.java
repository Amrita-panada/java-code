import java.util.LinkedList;
import java.util.Queue;
public class BasicsQ {
    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll()); // remove 1st element

        System.out.println(queue);

        System.out.println(queue.peek());

        //other 3 property for which give exception
        /*add()
         element()
          remove() */

    }
}
