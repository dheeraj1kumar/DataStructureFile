

// import java.util.ArrayList;

// public class A1 {
//     public static void main(String[] args) {
//         ArrayList<String> list=new ArrayList<>();
//          list.add("apple");
//          list.add("orange");
//          list.add("grapes");
//          list.add("wo");
//          list.add("no");
//          for(int i:list){
//          System.out.println(i);
//          }
//     }
// }



import java.util.ArrayList;

public class A1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
         list.add(1);//O(1)
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         System.out.println(list);
         //Get operation
         int element=list.get(2);
         System.out.println(element);

         //delete
         list.remove(2);
         System.out.println(list);

         //set
         list.set(2,10);
         System.out.println(list);

         //contain 

         System.out.println(list.contains(1));
         System.out.println(list.contains(12));

         //add
         list.add(1,78);//O(n)
         System.out.println(list);

         //size;

         System.out.println(list.size());

    }
}