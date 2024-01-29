

package HASHING.HASHMAP;
import java.util.*;
import java.util.LinkedHashMap;



public class h5{


    public static void main(String args[]){
   TreeMap<String,Integer> tm=new TreeMap<>();
       

        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Us", 20);
        tm.put("Nepa", 15);
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 20);
        hm.put("Nepa", 15);
        
        System.out.println(tm);//alphabetical order in basis of key
        System.out.println(hm);
    }
    
}
