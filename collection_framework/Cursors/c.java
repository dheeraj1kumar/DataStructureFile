/*
 * Cursor:-If want retrieve the object from the collection one by one 
then we used cursor. In java there are three types of cursor. 
1) Enumeration 
2) Iterator 
3) ListIterator 
 */

 /*
  * Enumeration :- 
 Enumeration interface introduce in 1.0 version of java so it 
is legacy class. 
 We used Enumeration to retrieve the object only from legacy 
collection class like Vector, Stack etc so it is not universal 
cursor because we can use this cursor only for legacy class . 
 We can create Enumeration class object by using elements() 
method. 

  */




//Example:- 
// import java.util.*; 
// class c
// { 
// public static void main(String[]args) 
// { 
// Vector v=new Vector(); 
// for(int i=0;i<10;i++) 
// { 
// v.add(i); 
// } 
// System.out.println(v); 
// Enumeration e=v.elements(); 
// while(e.hasMoreElements()) 
// { 
// Integer I=(Integer)e.nextElement(); 
// if(I%2==0) 
// { 
// System.out.print(I); 
// } 
// } 
// } 
// } 
/*Result:- [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] 
 02468 



Limitation of Enumeration cursor:- 
1) We apply only Legacy collection class. 
2) We can perform only read operation. 
3) We can performed remove operation.*/



/*
 * Iterator:- 
 Iterator interface introduce in 1.2 version of java and it is 
not legacy class. 
 We can use Iterator to retrieve the object from all collection 
class so Iterator cursor is considered as universal cursor. 
 We can create Iterator class object by using iterator() 
method. 
Syntax of iterator() method: 
public Iterator iterator() 
13 COLLECTION FRAMEWORK 
Example:- 
Vector v=new Vector(); 
Iterator itr=v.iterator();//v can be any collection class 
object.
 */

// import java.util.*;
// class c 
// { 
// public static void main(String[]args) 
// { 
// Vector v=new Vector(); 
// for(int i=0;i<10;i++) 
// { 
// v.add(i); 
// } 
// System.out.println(v); 
// Iterator itr=v.iterator(); 
// while(itr.hasNext()) 
// { 
// Integer I=(Integer)itr.next(); 
// if(I%2==0) 
// System.out.print(I); 
// else 
// itr.remove(); 
// } 
// System.out.println(v); 
// } 
// } 
/*Result:- 
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9] 
02468 
[0, 2, 4, 6, 8]*/



/*
 * Limitation of Iteratror cursor:- 
1) By using Enumeration and Iterator cursor we can retrieval 
element only forward direction and we can’t retrieve element 
backward(reverse) direction. So Enumeration and Iterator are 
unidirectional cursor. 
2) By using Enumeration and Iterator cursor we can performed read 
and remove operation only we can’t performed replacement and 
add new element. 
3) Overcome these limitation we used ListIterator cursor. 
ListIterator:- 
 By using ListIterator cursor we can perform read , remove ,set 
and insert operation. 
 We can retrieve the element from in both direction (forward 
direction and backward(reverse)direction) . 
 ListIterator introduce in 1.2 version of java so it is not 
legacy. 
 We can create ListIterator class object by using 
listIterator() method. 
Syntax of listIterator() method:- 
public ListIterator listIterator() 
Example:- 
Vector v=new Vector(); 
ListIterator itr=v.listIterator();//v can collection class 
object reference. 


 */




import java.util.*; 
class c
{ 
public static void main(String[]args) 
{ 
 //COLLECTION FRAMEWORK 
LinkedList ll=new LinkedList(); 
ll.add("vikas"); 
ll.add("vivek"); 
ll.add("bishal"); 
ll.add("uday"); 
ll.add("yogesh"); 
System.out.println(ll); 
ListIterator itr=ll.listIterator(); 
while(itr.hasNext()) 
{ 
  
String str=(String)itr.next(); 
System.out.println(str);
if(str.equals("uday")) 
{ 
itr.remove(); 
System.out.println(ll); 
} 
else if(str.equals("yogesh")) 
{ 
itr.set("ravi"); 
} 
} 
System.out.println(ll); 
} 
} 


/*Result:- 
[vikas, vivek, bishal, uday, yogesh] 
[vikas, vivek, bishal, yogesh] 
[vikas, vivek, bishal, ravi] 
Retrieving object of collection classes:-There are three ways to 
retrieve the object from collection class. 
1) By using for-each loop. 
2) By using get() method. 
3) By using cursors. 
Example:- */



// import java.util.*; 
// class c 
// { 
// public static void main(String[]args) 
// { 
// ArrayList al=new ArrayList(); 
// al.add("vikas"); 
// 16 COLLECTION FRAMEWORK 
// al.add("vivek"); 
// al.add("bishal"); 
// al.add("ravi"); 
// //Ist approach to retrieve Object from collection. 
// System.out.println("Ist approach to retrieve Object from 
// collection."); 
// for(Object o:al) 
// { 
// System.out.println((String)o); 
// } 
// //2nd approach to retrieve Object from collection. 
// System.out.println("2nd approach to retrieve Object from 
// collection."); 
// int size=al.size(); 
// for(int i=0;i<size;i++) 
// { 
// System.out.println((String)al.get(i)); 
// } 
// //3rd approach to retrieve Object from collection. 
// System.out.println("3rd approach to retrieve Object from 
// collection."); 
// Iterator itr=al.iterator(); 
// while(itr.hasNext()) 
// { 
// String s1=(String)itr.next(); 
// System.out.println(s1); 
// } 
// } 
// }