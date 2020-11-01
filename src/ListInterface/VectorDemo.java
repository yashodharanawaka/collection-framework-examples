package ListInterface;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        List<Integer> v=new Vector<>();

        for (int i = 1; i < 12; i++)
            v.add(i);

        System.out.println(v);

        System.out.println("Vector size: "+v.size());

        v.remove(4);

        System.out.println("New int at index 4 is: "+v.get(4));

        v.forEach(System.out::println);

        System.out.println("New Vector size: "+v.size());

        //System.out.println(v.capacity());
    }
}
