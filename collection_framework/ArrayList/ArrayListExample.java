/*Java ArrayList Example
FileName: ArrayListExample1.java*/

// import java.util.*;  
//  public class ArrayListExample{  
//  public static void main(String args[]){  
//   ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
//       list.add("Mango");//Adding object in arraylist    
//       list.add("Apple");    
//       list.add("Banana");    
//       list.add("Grapes");    
//       //Printing the arraylist object   
//       System.out.println(list);  
//  }  
// }  

/*Test it Now
Output:

[Mango, Apple, Banana, Grapes]


Iterating ArrayList using Iterator
Let's see an example to traverse ArrayList elements using the Iterator interface.
*/

// import java.util.*;  
// public class ArrayListExample{  
//  public static void main(String args[]){  
//   ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
//   list.add("Mango");//Adding object in arraylist    
//   list.add("Apple");    
//   list.add("Banana");    
//   list.add("Grapes");    
//   //Traversing list through Iterator  
//   Iterator itr=list.iterator();//getting the Iterator  
//   while(itr.hasNext()){//check if iterator has the elements  
//    System.out.println(itr.next());//printing the element and move to next  
//   }  
//  }  
// }  


/*Test it Now
Output:

Mango
Apple
Banana
Grapes
Iterating ArrayList using For-each loop
Let's see an example to traverse the ArrayList elements using the for-each loop

FileName: ArrayListExample3.java*/

// import java.util.*;  
// public class ArrayListExample{  
//  public static void main(String args[]){  
//   ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
//   list.add("Mango");//Adding object in arraylist    
//   list.add("Apple");    
//   list.add("Banana");    
//   list.add("Grapes");    
//   //Traversing list through for-each loop  
//   for(String fruit:list)    
//     System.out.println(fruit);    
  
//  }  
// }  


/*Output:

Test it Now
Mango
Apple
Banana
Grapes


Get and Set ArrayList
The get() method returns the element at the specified index, whereas the set() method changes the element.

FileName: ArrayListExample4.java*/

// import java.util.*;  
// public class ArrayListExample{  
//  public static void main(String args[]){  
//   ArrayList<String> al=new ArrayList<String>();  
//   al.add("Mango");  
//   al.add("Apple");  
//   al.add("Banana");  
//   al.add("Grapes");  
//   //accessing the element    
//   System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
//   //changing the element  
//   al.set(1,"Dates");  
//   //Traversing list  
//   for(String fruit:al)    
//     System.out.println(fruit);    
  
//  }  
// }  


/*Test it Now
Output:

Returning element: Apple
Mango
Dates
Banana
Grapes*/ /*


How to Sort ArrayList
The java.util package provides a utility class Collections, which has the static method sort(). Using the Collections.sort() method, we can easily sort the ArrayList.

FileName: SortArrayList.java*/

// import java.util.*;  
// class ArrayListExample{  
//  public static void main(String args[]){  
//   //Creating a list of fruits  
//   List<String> list1=new ArrayList<String>();  
//   list1.add("Mango");  
//   list1.add("Apple");  
//   list1.add("Banana");  
//   list1.add("Grapes");  
//   //Sorting the list  
//   Collections.sort(list1);  
//    //Traversing list through the for-each loop  
//   for(String fruit:list1)  
//     System.out.println(fruit);  
      
//  System.out.println("Sorting numbers...");  
//   //Creating a list of numbers  
//   List<Integer> list2=new ArrayList<Integer>();  
//   list2.add(21);  
//   list2.add(11);  
//   list2.add(51);  
//   list2.add(1);  
//   //Sorting the list  
//   Collections.sort(list2);  
//    //Traversing list through the for-each loop  
//   for(Integer number:list2)  
//     System.out.println(number);  
//  }  
   
// } 

/*  
Output:

Apple
Banana
Grapes
Mango
Sorting numbers...
1
11
21
51


Ways to iterate the elements of the collection in Java
There are various ways to traverse the collection elements:

By Iterator interface.
By for-each loop.
By ListIterator interface.
By for loop.
By forEach() method.
By forEachRemaining() method.
Iterating Collection through remaining ways
Let's see an example to traverse the ArrayList elements through other ways

FileName: ArrayList4.java*/

// import java.util.*;  
// class ArrayListExample{  
//  public static void main(String args[]){  
//     ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
//            list.add("Ravi");//Adding object in arraylist  
//            list.add("Vijay");  
//            list.add("Ravi");  
//            list.add("Ajay");  
            
//            System.out.println("Traversing list through List Iterator:");  
//            //Here, element iterates in reverse order  
//               ListIterator<String> list1=list.listIterator(list.size());  
//               while(list1.hasPrevious())  
//               {  
//                   String str=list1.previous();  
//                   System.out.println(str);  
//               }  
//         System.out.println("Traversing list through for loop:");  
//            for(int i=0;i<list.size();i++)  
//            {  
//             System.out.println(list.get(i));     
//            }  
              
//         System.out.println("Traversing list through forEach() method:");  
//         //The forEach() method is a new feature, introduced in Java 8.  
//             list.forEach(a->{ //Here, we are using lambda expression  
//                 System.out.println(a);  
//               });  
                
//             System.out.println("Traversing list through forEachRemaining() method:");  
//               Iterator<String> itr=list.iterator();  
//               itr.forEachRemaining(a-> //Here, we are using lambda expression  
//               {  
//             System.out.println(a);  
//               });  
//  }  
// }  
/*Output:

Traversing list through List Iterator:
Ajay
Ravi
Vijay
Ravi
Traversing list through for loop:
Ravi
Vijay
Ravi
Ajay
Traversing list through forEach() method:
Ravi
Vijay
Ravi
Ajay
Traversing list through forEachRemaining() method:
Ravi
Vijay
Ravi
Ajay


User-defined class objects in Java ArrayList
Let's see an example where we are storing Student class object in an array list.

FileName: ArrayList5.java*/

// class Student{  
//   int rollno; Sring name;  
//   int age;  
//   Student(int rollno,String name,int age){  
//    this.rollno=rollno;  
//    this.name=name;  
//    this.age=age;  
//   }  
// }  

// import java.util.*;  
//  class ArrayList5{  
//  public static void main(String args[]){  
//   //Creating user-defined class objects  
//   Student s1=new Student(101,"Sonoo",23);  
//   Student s2=new Student(102,"Ravi",21);  
//   Student s2=new Student(103,"Hanumat",25);  
//   //creating arraylist  
//   ArrayList<Student> al=new ArrayList<Student>();  
//   al.add(s1);//adding Student class object  
//   al.add(s2);  
//   al.add(s3);  
//   //Getting Iterator  
//   Iterator itr=al.iterator();  
//   //traversing elements of ArrayList object  
//   while(itr.hasNext()){  
//     Student st=(Student)itr.next();  
//     System.out.println(st.rollno+" "+st.name+" "+st.age);  
//   }  
//  }  
// }  
/*Output:

       101 Sonoo 23
       102 Ravi 21
       103 Hanumat 25
Java ArrayList Serialization and Deserialization Example
Let's see an example to serialize an ArrayList object and then deserialize it.

FileName: ArrayList6.java*/

// import java.io.*;  
// import java.util.*;  
//  class ArrayListExample {  
  
//         public static void main(String [] args)  
//         {  
//           ArrayList<String> al=new ArrayList<String>();  
//           al.add("Ravi");    
//           al.add("Vijay");    
//           al.add("Ajay");    
            
//           try  
//           {  
//               //Serialization  
//               FileOutputStream fos=new FileOutputStream("file");  
//               ObjectOutputStream oos=new ObjectOutputStream(fos);  
//               oos.writeObject(al);  
//               fos.close();  
//               oos.close();  
//               //Deserialization  
//               FileInputStream fis=new FileInputStream("file");  
//               ObjectInputStream ois=new ObjectInputStream(fis);  
//             ArrayList  list=(ArrayList)ois.readObject();  
//             System.out.println(list);    
//           }catch(Exception e)  
//           {  
//               System.out.println(e);  
//           }  
//        }  
//     }         
/*Output:

       [Ravi, Vijay, Ajay]


Java ArrayList example to add elements
Here, we see different ways to add an element.

FileName: ArrayList7.java*/

// import java.util.*;  
//  class ArrayListExample{  
//  public static void main(String args[]){  
//   ArrayList<String> al=new ArrayList<String>();  
//            System.out.println("Initial list of elements: "+al);  
//            //Adding elements to the end of the list  
//            al.add("Ravi");  
//            al.add("Vijay");  
//            al.add("Ajay");  
//            System.out.println("After invoking add(E e) method: "+al);  
//            //Adding an element at the specific position  
//            al.add(1, "Gaurav");  
//            System.out.println("After invoking add(int index, E element) method: "+al);  
//            ArrayList<String> al2=new ArrayList<String>();  
//            al2.add("Sonoo");  
//            al2.add("Hanumat");  
//            //Adding second list elements to the first list  
//            al.addAll(al2);  
//            System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
//            ArrayList<String> al3=new ArrayList<String>();  
//            al3.add("John");  
//            al3.add("Rahul");  
//            //Adding second list elements to the first list at specific position  
//            al.addAll(1, al3);  
//            System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  
             
//  }  
// }
 /*  
 output

Initial list of elements: []
After invoking add(E e) method: [Ravi, Vijay, Ajay]
After invoking add(int index, E element) method: [Ravi, Gaurav, Vijay, Ajay]
After invoking addAll(Collection<? extends E> c) method: 
[Ravi, Gaurav, Vijay, Ajay, Sonoo, Hanumat]
After invoking addAll(int index, Collection<? extends E> c) method: 
[Ravi, John, Rahul, Gaurav, Vijay, Ajay, Sonoo, Hanumat]


Java ArrayList example to remove elements
Here, we see different ways to remove an element.

FileName: ArrayList8.java*/

// import java.util.*;  
//  class ArrayListExample{  
  
//         public static void main(String [] args)  
//         {  
//           ArrayList<String> al=new ArrayList<String>();  
//           al.add("Ravi");    
//           al.add("Vijay");    
//           al.add("Ajay");   
//           al.add("Anuj");  
//           al.add("Gaurav");  
//           System.out.println("An initial list of elements: "+al);   
//           //Removing specific element from arraylist  
//           al.remove("Vijay");  
//           System.out.println("After invoking remove(object) method: "+al);   
//           //Removing element on the basis of specific position  
//           al.remove(0);  
//           System.out.println("After invoking remove(index) method: "+al);   
            
//           //Creating another arraylist  
//           ArrayList<String> al2=new ArrayList<String>();    
//           al2.add("Ravi");    
//           al2.add("Hanumat");    
//           //Adding new elements to arraylist  
//           al.addAll(al2);  
//           System.out.println("Updated list : "+al);   
//           //Removing all the new elements from arraylist  
//           al.removeAll(al2);  
//           System.out.println("After invoking removeAll() method: "+al);   
//           //Removing elements on the basis of specified condition  
//           al.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression   
//           System.out.println("After invoking removeIf() method: "+al);  
//           //Removing all the elements available in the list  
//           al.clear();  
//           System.out.println("After invoking clear() method: "+al);   
//        }  
//     }                   
/*Output:

An initial list of elements: [Ravi, Vijay, Ajay, Anuj, Gaurav]
After invoking remove(object) method: [Ravi, Ajay, Anuj, Gaurav]
After invoking remove(index) method: [Ajay, Anuj, Gaurav]
Updated list : [Ajay, Anuj, Gaurav, Ravi, Hanumat]
After invoking removeAll() method: [Ajay, Anuj, Gaurav]
After invoking removeIf() method: [Anuj, Gaurav]
After invoking clear() method: []



Java ArrayList example of retainAll() method
FileName: ArrayList9.java*/

// import java.util.*;  
// class ArrayListExample{  
//  public static void main(String args[]){  
//   ArrayList<String> al=new ArrayList<String>();  
//   al.add("Ravi");  
//   al.add("Vijay");  
//   al.add("Ajay");  
//   ArrayList<String> al2=new ArrayList<String>();  
//   al2.add("Ravi");  
//   al2.add("Hanumat");  
//   al.retainAll(al2);  
//   System.out.println("iterating the elements after retaining the elements of al2");  
//   Iterator itr=al.iterator();  
//   while(itr.hasNext()){  
//    System.out.println(itr.next());  
//   }  
//  }  
// }  



/*Output:

       iterating the elements after retaining the elements of al2
       Ravi
Java ArrayList example of isEmpty() method
FileName: ArrayList4.java

import java.util.*;  
 class ArrayList10{  
  
        public static void main(String [] args)  
        {  
          ArrayList<String> al=new ArrayList<String>();  
          System.out.println("Is ArrayList Empty: "+al.isEmpty());  
          al.add("Ravi");    
          al.add("Vijay");    
          al.add("Ajay");    
          System.out.println("After Insertion");  
          System.out.println("Is ArrayList Empty: "+al.isEmpty());   
       }  
    }      
/*Output:

Is ArrayList Empty: true
After Insertion
Is ArrayList Empty: false
Java ArrayList Example: Book
Let's see an ArrayList example where we are adding books to the list and printing all the books.

FileName: ArrayListExample20.java*/

// import java.util.*;  
// class Book {  
// int id;  
// String name,author,publisher;  
// int quantity;  
// public Book(int id, String name, String author, String publisher, int quantity) {  
//     this.id = id;  
//     this.name = name;  
//     this.author = author;  
//     this.publisher = publisher;  
//     this.quantity = quantity;  
// }  
// }  
// public class ArrayListExample {  
// public static void main(String[] args) {  
//     //Creating list of Books  
//     List<Book> list=new ArrayList<Book>();  
//     //Creating Books  
//     Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
//     Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
//     Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
//     //Adding Books to list  
//     list.add(b1);  
//     list.add(b2);  
//     list.add(b3);  
//     //Traversing list  
//     for(Book b:list){  
//         System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
//     }  
// }  
// }  
/*Test it Now
Output:

101 Let us C Yashwant Kanetkar BPB 8
102 Data Communications and Networking Forouzan Mc Graw Hill 4
103 Operating System Galvin Wiley 6
Size and Capacity of an ArrayList
Size and capacity of an array list are the two terms that beginners find confusing. Let's understand it in this section with the help of some examples. Consider the following code snippet.

FileName: SizeCapacity.java
*/
// import java.util.*;  
  
// public class ArrayListExample
// {  
  
// public static void main(String[] args) throws Exception  
// {  
       
//     ArrayList<Integer> al = new ArrayList<Integer>();  
      
//     System.out.println("The size of the array is: " + al.size());  
// }  
// }  
/*Output:

The size of the array is: 0
Explanation: The output makes sense as we have not done anything with the array list. Now observe the following program.

FileName: SizeCapacity1.java*/

// import java.util.*;  
  
// public class ArrayListExample 
// {  
  
// public static void main(String[] args) throws Exception  
// {  
       
//     ArrayList<Integer> al = new ArrayList<Integer>(10);  
      
//     System.out.println("The size of the array is: " + al.size());  
// }  
// }  
/*Output:

The size of the array is: 0*/