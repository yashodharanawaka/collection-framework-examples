package SetInterface.Sorted;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> treeSet =  new TreeSet<>();

        treeSet.add("Five");
        treeSet.add("little");
        treeSet.add("pumpkins");
        treeSet.add("Sitting");
        treeSet.add("on");
        treeSet.add("a");
        treeSet.add("gate");
        treeSet.add("Pumpkins");
        treeSet.add("on");

/*        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(8);*/

        System.out.println(treeSet);
    }
}
