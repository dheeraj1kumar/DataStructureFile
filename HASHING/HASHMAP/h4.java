package HASHING.HASHMAP;
import java.util.*;
import java.util.LinkedHashMap;

import javax.sound.sampled.SourceDataLine;


public class h4 {


    public static void main(String args[]){
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
       

        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("Us", 150);
        lhm.put("Nepa", 15);
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 150);
        hm.put("Nepa", 15);
        
        System.out.println(lhm);
        System.out.println(hm);
    }
    
}
