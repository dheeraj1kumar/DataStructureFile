
//sorting array
import java.util.ArrayList;
import java.util.Collections;
public class A6 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
         list.add(1);//O(1)
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         System.out.println(list);
         Collections.sort(list);
         System.out.println(list);


         //descending
         Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);
        }}
    
