package SetInterface;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) throws IOException {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Row");
        hashSet.add("row");
        hashSet.add("your");
        hashSet.add("boat");
        hashSet.add("gently");
        hashSet.add("down");
        hashSet.add("the");
        hashSet.add("stream");
        hashSet.add("Merrily ");
        hashSet.add("merrily");
        hashSet.add("merrily");
        hashSet.add("merrily");
        hashSet.add("Life");
        hashSet.add("is");
        hashSet.add("but");
        hashSet.add("a");
        hashSet.add("dream");

        System.out.println(hashSet);

        System.out.println(hashSet.size());

        hashSet.remove("is");

        hashSet.forEach(System.out::println);
    }
}
