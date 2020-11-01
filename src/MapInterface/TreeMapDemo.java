package MapInterface;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(3,"Hell");
        treeMap.put(1,"Hello");
        treeMap.put(2,"Halloween");
        treeMap.put(0,"hi");

        System.out.println(treeMap);

    }
}
