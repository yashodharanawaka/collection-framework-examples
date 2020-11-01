package MapInterface;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(2,"Ding");
        hashMap.put(1,"Ring");
        hashMap.put(3,"Dong");

        System.out.println(hashMap);
    }
}
