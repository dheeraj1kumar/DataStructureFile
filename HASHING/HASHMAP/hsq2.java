package HASHING.HASHMAP;
import java.util.*;


//Union & Intersection of 2 array
public class hsq2 {
    public static void main(String[] args) {
        
    
    int a[]={7,3,9};
    int b[]={6,3,9,2,9,4};
    HashSet<Integer> set =new HashSet<>();

    //union
    for(int i=0;i<b.length;i++){
        set.add(b[i]);
    }

    System.out.print("Union="+set.size());
    //loop use karke element print kara sakte hai
   
   
    Iterator it=set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }


    //intesectionfor(int i=0;i<a.length;i++){

 set.clear();

 for(int i=0;i<a.length;i++){
    set.add(a[i]);
}
int count=0;
for(int i=0;i<b.length;i++){
   if(set.contains(b[i])){
    count++;
    set.remove(b[i]);//or remove time print kar sakte hai
   }
}
System.out.println("Intersection="+count);//loop use for element


 

    
}
}