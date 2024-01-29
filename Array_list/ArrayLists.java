
import java.util.Collections;
import java.util.ArrayList;
class ArrayLists{
    public static void main(String args[]){
   ArrayList<Integer> list1=new ArrayList<>();
   //ArrayList<String> list2=new ArrayList<>();
  // ArrayList<Boolean> list3=new ArrayList<>();


//add element
  list1.add(0);
list1.add(1);
list1.add(2);
list1.add(3);
System.out.println(list1);


//get element

int element =list1.get(0);
System.out.println(element);


//add el in between
list1.add(1,1);
System.out.println(list1);



//set element
list1.set(0,5);

//delete element
list1.remove(3);
System.out.println(list1);


int size=list1.size();
System.out.println(size);


//loops

for(int i=0;i<list1.size();i++){
    System.out.print(i);
}
System.out.println();


//sorting
Collections.sort(list1);
System.out.println(list1);


        
    }

}