package SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Row");
        linkedHashSet.add("row");
        linkedHashSet.add("your");
        linkedHashSet.add("boat");
        linkedHashSet.add("gently");
        linkedHashSet.add("down");
        linkedHashSet.add("the");
        linkedHashSet.add("stream");
        linkedHashSet.add("Merrily ");
        linkedHashSet.add("merrily");
        linkedHashSet.add("merrily");
        linkedHashSet.add("merrily");
        linkedHashSet.add("Life");
        linkedHashSet.add("is");
        linkedHashSet.add("but");
        linkedHashSet.add("a");
        linkedHashSet.add("dream");

        System.out.println(linkedHashSet);

        System.out.println(linkedHashSet.size());

        linkedHashSet.remove("is");

        linkedHashSet.forEach(System.out::println);
    }
}
