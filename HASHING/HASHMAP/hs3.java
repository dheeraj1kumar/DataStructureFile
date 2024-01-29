package HASHING.HASHMAP;
import java.util.*;
public class hs3 {
    public static void main(String[] args) {
      LinkedHashSet<String> cities=new LinkedHashSet<>();
cities.add("Delhi");
cities.add("Mumbai");
cities.add("Noida");
cities.add("Bengal");
cities.add("Bihar");

System.out.println(cities);
/* 
Iterator it=cities.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}
*/

for(String city: cities){
System.out.println(city);//print on basis of insertion order
}

    }
}
