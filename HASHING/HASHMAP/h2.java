package HASHING.HASHMAP;

import java.util.HashMap;
import java.util.Set;

public class h2 {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert
        hm.put("India", 100);
        hm.put("China", 50);

        // Iterate
        // hm.entrySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {

            System.out.println("key=" + k + ",Value=" + hm.get(k));
        }

    }
}