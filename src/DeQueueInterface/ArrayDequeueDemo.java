package DeQueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(50);
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);

        System.out.println(deque);

        deque.addFirst(60);
        System.out.println(deque);

        deque.clear();

        System.out.println(deque);

        deque.addLast(10);
        deque.addLast(30);
        deque.addFirst(20);
        deque.addFirst(30);

        System.out.println(deque);

    }
}
