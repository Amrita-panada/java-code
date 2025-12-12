import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQ {
    public static void main(String[] args){
        Queue<Integer>pq=new PriorityQueue<>();//by default minhip 
       // Queue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder()); //maxhip implement ,1st number it will givw the largest one

        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
    }
}
