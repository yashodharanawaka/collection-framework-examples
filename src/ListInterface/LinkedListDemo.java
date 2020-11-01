package ListInterface;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> ll=new LinkedList<>();

        for (int i = 1; i <7; i++)
            ll.add(i);

        System.out.println(ll);
        System.out.println("Linked List size: "+ll.size());

        ll.remove(4);

        System.out.println("New int at index 4 is: "+ll.get(4));

        for (int i:ll)
            System.out.println(i);

        System.out.println("New Linked List size: "+ll.size());
    }
}
