package HASHING.HASHMAP;
import java.util.*;
public class hs1 {
    public static void main(String[] args) {
        
    
// HashSet<Integer> set =new HashSet<>();
TreeSet<Integer> set =new TreeSet<>();

set.add(6);
set.add(1);
set.add(10);
set.add(4);
// set.add(2);
// set.add(1);

System.out.println(set);


//set.remove(2);
if(set.contains(2)){
    System.out.println("Set contain 2");
}
if(set.contains(3)){
    System.out.println( "set contain 3");
}

System.out.println(set.size());

set.clear();
System.out.println(set.size());

System.out.println(set.isEmpty());
    }
}
