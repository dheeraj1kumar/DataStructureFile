//HashMap

// import java.util.*; 
// class m
// { 
// public static void main(String[]args) 
// { 
// HashMap hm=new HashMap(); 
// hm.put(1118,"vikas"); 
// hm.put(1119,"vivek"); 
// hm.put(1120,"yogesh"); 
// hm.put(4093,"ravi"); 
// Set s1=hm.keySet(); 
// System.out.println("All Key="+s1); 
// Collection c=hm.values(); 
// System.out.println("Total value="+c); 
// Set s2=hm.entrySet(); 
// System.out.println("All Entry"+s2); 
// Iterator itr=s2.iterator(); 
// while(itr.hasNext()) 
// { 
// Map.Entry me=(Map.Entry)itr.next(); 
// System.out.println(me.getKey()+"..."+me.getValue()); 
// } 
// } 
// } 


//Linked HashMap

// import java.util.*; 
// class m 
// { 
// public static void main(String[]args) 
// { 
// LinkedHashMap lhm=new LinkedHashMap(); 
// lhm.put(1118,"vikas"); 
// lhm.put(1119,"vivek"); 
// lhm.put(1120,"yogesh"); 
// lhm.put(4093,"ravi"); 
// Set s1=lhm.keySet(); 
// System.out.println("All Key="+s1); 
// Collection c=lhm.values(); 
// System.out.println("Total value="+c); 
// Set s2=lhm.entrySet(); 
// System.out.println("All Entry"+s2); 
// Iterator itr=s2.iterator(); 
// while(itr.hasNext()) 
// { 
// Map.Entry me=(Map.Entry)itr.next(); 
// System.out.println(me.getKey()+"..."+me.getValue()); 
// } 
// } 
// } 


//identity hashmap

import java.util.*; 
class IdentityHashMapDemo 
{ 
public static void main(String[]args) 
{ 
HashMap hm=new HashMap(); 
Integer I1=new Integer(12); 
Integer I2=new Integer(12); 
hm.put(I1,"vikas"); 
hm.put(I2,"vivek"); 
System.out.println(hm);//last entry show. 
IdentityHashMap ihm=new IdentityHashMap(); 
ihm.put(I1,"vikas"); 
ihm.put(I2,"vivek"); 
System.out.println(ihm); 
} 
}