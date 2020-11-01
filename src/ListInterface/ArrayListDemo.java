package ListInterface;


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>();

        for(int i=1; i<6;i++)
            al.add(i);

        System.out.println(al);
        System.out.println("Array List size: "+al.size());

        al.remove(3);

        System.out.println("New int at index 4 is: "+al.get(3));

        al.forEach(System.out::println);

        System.out.println("New Array List size: "+al.size());
    }
}
