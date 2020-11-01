package QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        for (int i = 2; i <20 ; i++)
            pq.add(i);

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());

        System.out.println(pq);
        pq.remove(9);
        System.out.println(pq);

    }
}
