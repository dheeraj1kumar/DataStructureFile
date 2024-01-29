package HASHING.HASHMAP;

import java.util.HashMap;

import org.w3c.dom.html.HTMLButtonElement;

public class h1 {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert
        hm.put("India", 100);
        hm.put("China", 50);
        System.out.println(hm);

        // hashmap is unorder not sequensetly

        // Get

        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("russia"));

        // ContainsKey

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("russia"));

        // remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());

        // clear
        hm.clear();// saff
        System.out.println(hm);

    }

}
