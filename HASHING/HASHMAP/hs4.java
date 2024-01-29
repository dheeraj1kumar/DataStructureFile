package HASHING.HASHMAP;
import java.util.*;

public class hs4 {
    public static void main(String[] args) {
       TreeSet<String> cities=new TreeSet<>();
cities.add("Delhi");
cities.add("Mumbai");
cities.add("Noida");
cities.add("Bengal");
cities.add("Bihar");
/* 
Iterator it=cities.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}
*/

for(String city: cities){
System.out.println(city);//according to sorting albhabetically
}

    }
}
