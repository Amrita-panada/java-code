import java.util.*;

public class ArrayQueue {
    static class Queue {
        int arr[];
        int size;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // add
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            arr[++rear] = data; // increment rear and add data
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6); // This will print "queue is full"

        System.out.println(q.remove()); // 1
        System.out.println(q.peek());   // 2
        System.out.println(q.remove()); // 2
        System.out.println(q.remove()); // 3
        System.out.println(q.remove()); // 4
        System.out.println(q.remove()); // 5
        System.out.println(q.remove()); // This will print "empty queue" and return -1
    }
}
