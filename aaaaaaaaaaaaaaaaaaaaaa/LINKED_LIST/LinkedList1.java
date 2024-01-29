
//  AS in array and ArrayList we hava seen that data is visualised serialwise same case occur with Linked List.
// chain of Linded_list is formed and that chain is k/a Link and single element connected through chain is called as Node
// Linked List can store any tye of data.
//  we can store any type of data in linked list 
// next is used to point out the next term of linked list.
// inside node we generally insert data of any information.
// whenever we traverse in a linked list we have single type of data at a time.

//              NOTE
// Reference Variable:- The variable that point to an object.
// To create Linked List we have to make class of node.
// In a node same type of information is kept(data+next).


// public class LinkedList1{
//     public static class Node{
//         int data;
//         Node next;  // Node is object of same class(i.e. Node itself).
//         public Node(int data){  // constructor.
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public void addFirst(int data){

//         // when there is one or more than one node
//         // step1=create new node
//         Node newNode=new Node(data);
//         // step2:- newNode next=head
//         newNode.next=head;  // linking step:- one node is connected to another node and current value stored in next
//         //newNode.next=head; :- linked list create

//         // step3:- head behave as new node


//     }
//     public static void main(String[] args) {
//         LinkedList1 ll=new LinkedList1();
        //// ll.head=new Node(1);
        //// ll.head.next=new Node(2);
//     }
// }





// // while traversing in ListList we have only one type of data at a that time.
// // using Node data we find out next information and we point to next node.
// public class LinkedList1{
//     public static class Node{    // Node class creation
//         int data;
//         // we will define Node object of Node class
//         Node next;  // next is basically a reference variable.type of next is node b/c next point to Object(Node).
//         public Node(int data){  // constructor
//             this.data=data;
//             this.next=null;
//         }
//     }
// // inside LinkedList only one head and tail is present so we define them in a class.

//     public static Node head;    // head node comes 1st in LinkedList.
//     public static Node tail;    // tail node come at last in LinkedList.
//     // tail Node is a last valid Node where data is stored.
//     public void addFirst(int data){

//         // when  link list is empty i.e. no Node is present

//         // step1=create new node
//         Node newNode=new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         // step2:- newNode next=head
//         newNode.next=head; //:- linked list create

//         // step3:- head behave as new node
//         head=newNode;
//     }
//     public void addLast(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }

//     public void print(){        // IT IS  LINEAR SO ITS TIME COMPLEXITY IS O(n).
//         if(head==null){
//             System.out.println("Linked List is empty");
//             return;
//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"-->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args) {
//         LinkedList1 ll=new LinkedList1();
//         // ll.addFirst(12);
//         ll.print();
//         ll.addFirst(2);
//         ll.print();
//         ll.addFirst(1);
//         ll.print();
//         ll.addFirst(29);
//         ll.print();
//         // System.out.println(ll);
//         ll.addLast(3);
//         ll.print();
//         ll.addLast(4);
//         ll.print();
//         ll.addFirst(0);
//         ll.print();  
//     }
// }


                // ADD ELEMENTS IN THE MIDDLE IN LINKED LIST


public class LinkedList1{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){

        // when  link list is empty i.e. no Node is present
        // step1=create new node


        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        // step2:- newNode next=head
        newNode.next=head; //:- linked list create

        // step3:- head behave as new node
        head=newNode;


    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){        // IT IS  LINEAR SO ITS TIME COMPLEXITY IS O(n).
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){

        if(idx==0){
            addFirst(data);     // at add first both head and tail value get change
            return;
        }

        Node newNode=new Node(data);            // NODE CREATION
        Node temp=head;
        int i=0;                            // IT WILL TRACK INDEX NUMBER OF TEMP VARIABLE.
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // i=idx-1;  temp--> prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);        // at index 2 node 9 is added.
        ll.print();
    }
}






                

//                  SIZE OF LINKED LIST :- By default value size of array in LinkedList is zero.


// public class LinkedList1{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;         //  size is static because  node increases size which occurs in same size.
//     //   by default value of size is zero .
  


//     public void addFirst(int data){

//         // when  link list is empty i.e. no Node is present
//         // step1=create new node
//         Node newNode=new Node(data);
//         // as soon as newNode create size will increase
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         // step2:- newNode next=head
//         newNode.next=head; //:- linked list create

//         // step3:- head behave as new node
//         head=newNode;


//     }

//     public void addLast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }

//     public void print(){        // IT IS  LINEAR SO ITS TIME COMPLEXITY IS O(n).
//         if(head==null){
//             System.out.println("Linked List is empty");
//             return;
//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"-->");
//             System.out.print(temp.data+"null");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void add(int idx,int data){

//         // base case
//         if(idx==0){
//             addFirst(data);     // at add first both head and tail value get change
//             return;
//         }

//         Node newNode=new Node(data);            // NODE CREATION
//         size++;
//         Node temp=head;
//         int i=0;                            // IT WILL TRACK INDEX NUMBER OF TEMP VARIABLE.
//         while(i<idx-1){
//             temp=temp.next;
//             i++;
//         }
//         // i=idx-1;  temp--> prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public static void main(String[] args) {
//         LinkedList1 ll=new LinkedList1();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.add(2,3);        // at index 2 node 9 is added.
//         ll.print();
//         System.out.println(ll.size);
//     }
// }











//                          REMOVE METHOD IN LINKED LIST


// REMOVE_FIRST:---

// Linked list always starts from head
// Singly Link List:- in singly linked list we always talk about  forward link 



// public class LinkedList1{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;         //  size is static because  node increases size which occurs in same size.
//     //   by default value of size is zero .
  


//     public void addFirst(int data){

//         // when  link list is empty i.e. no Node is present
//         // step1=create new node
//         Node newNode=new Node(data);
//         // as soon as newNode create size will increase
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         // step2:- newNode next=head
//         newNode.next=head; //:- linked list create

//         // step3:- head behave as new node
//         head=newNode;


//     }

//     public void addLast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }

//     public void print(){        // IT IS  LINEAR SO ITS TIME COMPLEXITY IS O(n).
//         if(head==null){
//             System.out.println("Linked List is empty");
//             return;
//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"-->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void add(int idx,int data){

//         // base case
//         if(idx==0){
//             addFirst(data);     // at add first both head and tail value get change
//             return;
//         }

//         Node newNode=new Node(data);            // NODE CREATION
//         size++;
//         Node temp=head;
//         int i=0;                            // IT WILL TRACK INDEX NUMBER OF TEMP VARIABLE.
//         while(i<idx-1){
//             temp=temp.next;
//             i++;
//         }
//         // i=idx-1;  temp--> prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeFirst(){
//         // while remove first  size must be change

//         // special case inside remove first
//         if(size==0){    // no change
//             System.out.println("linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1)  {     // head and tail both are same
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;

//         }

//         int val=head.data;
//         head=head.next;
//         size--;
//         return val;
//     }
//     public static void main(String[] args) {
//         LinkedList1 ll=new LinkedList1();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.add(2,3);        // at index 2 node 9 is added.
//         ll.print();
//         // System.out.println(ll.size);
//         ll.removeFirst();
//         ll.print();
//     }
// }








//  REMOVE_LAST




// public class LinkedList1{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;         //  size is static because  node increases size which occurs in same size.
//     //   by default value of size is zero .
  


//     public void addFirst(int data){

//         // when  link list is empty i.e. no Node is present
//         // step1=create new node
//         Node newNode=new Node(data);
//         // as soon as newNode create size will increase
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         // step2:- newNode next=head
//         newNode.next=head; //:- linked list create

//         // step3:- head behave as new node
//         head=newNode;


//     }

//     public void addLast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }

//     public void print(){        // IT IS  LINEAR SO ITS TIME COMPLEXITY IS O(n).
//         if(head==null){
//             System.out.println("Linked List is empty");
//             return;
//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"-->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void add(int idx,int data){

//         // base case
//         if(idx==0){
//             addFirst(data);     // at add first both head and tail value get change
//             return;
//         }

//         Node newNode=new Node(data);            // NODE CREATION
//         size++;
//         Node temp=head;
//         int i=0;                            // IT WILL TRACK INDEX NUMBER OF TEMP VARIABLE.
//         while(i<idx-1){
//             temp=temp.next;
//             i++;
//         }
//         // i=idx-1;  temp--> prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeFirst(){
//         // while remove first  size must be change

//         // special case inside remove first
//         if(size==0){    // no change
//             System.out.println("linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1)  {     // head and tail both are same
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;

//         }

//         int val=head.data;
//         head=head.next;
//         size--;
//         return val;
//     }

//     public int removeLast(){
//         // if linked list is vacant then size will be zero
//         if(size==0){
//             System.out.println("Linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1){           // if linked list size is 1 then delete head as well as tail..
//             int val=head.data;
//             head=tail=null;             // head and tail both are null.
//             size=0;
//             return val;

//         }

//         // To reach previous Node using loop  :  i = size-2
//         Node prev=head;     // prev is initilized as head.
//         for(int i=0;i<size-2 ;i++){
//             prev=prev.next;

//         }
//         int val=prev.next.data;     // tail data :data is stored before deletion.
//         prev.next=null;             // previous next is point out as null
//         tail=prev;              // previous value is assigned to tail.
//         size--;
//         return val;             // deleted value is returned.


//     }
//     public static void main(String[] args) {
//         LinkedList1 ll=new LinkedList1();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.add(2,3);        // at index 2 node 9 is added.
//         ll.print();
//         // System.out.println(ll.size);
//         ll.removeFirst();
//         ll.print();

//         ll.removeLast();
//         ll.print();
//         System.out.println(ll.size);
//     }
// }









// ITERATIVE SEARCH





// public class LinkedList1{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;         //  size is static because  node increases size which occurs in same size.
//     //   by default value of size is zero .
  


//     public void addFirst(int data){

//         // when  link list is empty i.e. no Node is present
//         // step1=create new node
//         Node newNode=new Node(data);
//         // as soon as newNode create size will increase
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         // step2:- newNode next=head
//         newNode.next=head; //:- linked list create

//         // step3:- head behave as new node
//         head=newNode;


//     }

//     public void addLast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }

//     public void print(){        // IT IS  LINEAR SO ITS TIME COMPLEXITY IS O(n).
//         if(head==null){
//             System.out.println("Linked List is empty");
//             return;
//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"-->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void add(int idx,int data){

//         // base case
//         if(idx==0){
//             addFirst(data);     // at add first both head and tail value get change
//             return;
//         }

//         Node newNode=new Node(data);            // NODE CREATION
//         size++;
//         Node temp=head;
//         int i=0;                            // IT WILL TRACK INDEX NUMBER OF TEMP VARIABLE.
//         while(i<idx-1){
//             temp=temp.next;
//             i++;
//         }
//         // i=idx-1;  temp--> prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeFirst(){
//         // while remove first  size must be change

//         // special case inside remove first
//         if(size==0){    // no change
//             System.out.println("linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1)  {     // head and tail both are same
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;

//         }

//         int val=head.data;
//         head=head.next;
//         size--;
//         return val;
//     }

//     public int removeLast(){
//         // if linked list is vacant then size will be zero
//         if(size==0){
//             System.out.println("Linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1){           // if linked list size is 1 then delete head as well as tail..
//             int val=head.data;
//             head=tail=null;             // head and tail both are null.
//             size=0;
//             return val;

//         }

//         // To reach previous Node using loop  :  i = size-2
//         Node prev=head;     // prev is initilized as head.
//         for(int i=0;i<size-2 ;i++){
//             prev=prev.next;

//         }
//         int val=prev.next.data;     // tail data :data is stored before deletion.
//         prev.next=null;             // previous next is point out as null
//         tail=prev;              // previous value is assigned to tail.
//         size--;
//         return val;             // deleted value is returned.


//     }
//     public int itrSearch(int key){              // Time complexity during iterator is O(n).
//     Node temp=head;
//     int i=0;
//     while(temp!=null){
//         if(temp.data==key){
//             return i;
//     }
//         temp=temp.next;
//         i++;
//     }
//     // key not found case
//     return -1;
// }
//     public static void main(String[] args) {
//         LinkedList1 ll=new LinkedList1();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.add(2,3);        // at index 2 node 9 is added.
//         ll.print();
//         // System.out.println(ll.size);
//         // ll.removeFirst();
//         // ll.print();

//         // ll.removeLast();
//         // ll.print();
//         // System.out.println(ll.size);



//         System.out.println(ll.itrSearch(3));   // INDEX OF 3 IS 2
//         System.out.println(ll.itrSearch(10));   // 10 does not exist in linked list so -1.    
//     }
// }






// Recursive Search



// public class LinkedList1{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;         //  size is static because  node increases size which occurs in same size.
//     //   by default value of size is zero .
  


//     public void addFirst(int data){

//         // when  link list is empty i.e. no Node is present
//         // step1=create new node
//         Node newNode=new Node(data);
//         // as soon as newNode create size will increase
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         // step2:- newNode next=head
//         newNode.next=head; //:- linked list create

//         // step3:- head behave as new node
//         head=newNode;


//     }

//     public void addLast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }

//     public void print(){        // IT IS  LINEAR SO ITS TIME COMPLEXITY IS O(n).
//         if(head==null){
//             System.out.println("Linked List is empty");
//             return;
//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"-->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void add(int idx,int data){

//         // base case
//         if(idx==0){
//             addFirst(data);     // at add first both head and tail value get change
//             return;
//         }

//         Node newNode=new Node(data);            // NODE CREATION
//         size++;
//         Node temp=head;
//         int i=0;                            // IT WILL TRACK INDEX NUMBER OF TEMP VARIABLE.
//         while(i<idx-1){
//             temp=temp.next;
//             i++;
//         }
//         // i=idx-1;  temp--> prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeFirst(){
//         // while remove first  size must be change

//         // special case inside remove first
//         if(size==0){    // no change
//             System.out.println("linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1)  {     // head and tail both are same
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;

//         }

//         int val=head.data;
//         head=head.next;
//         size--;
//         return val;
//     }

//     public int removeLast(){
//         // if linked list is vacant then size will be zero
//         if(size==0){
//             System.out.println("Linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1){           // if linked list size is 1 then delete head as well as tail..
//             int val=head.data;
//             head=tail=null;             // head and tail both are null.
//             size=0;
//             return val;

//         }

//         // To reach previous Node using loop  :  i = size-2
//         Node prev=head;     // prev is initilized as head.
//         for(int i=0;i<size-2 ;i++){
//             prev=prev.next;

//         }
//         int val=prev.next.data;     // tail data :data is stored before deletion.
//         prev.next=null;             // previous next is point out as null
//         tail=prev;              // previous value is assigned to tail.
//         size--;
//         return val;             // deleted value is returned.


//     }
//     public int itrSearch(int key){              // Time complexity during iterator is O(n).
//     Node temp=head;
//     int i=0;
//     while(temp!=null){
//         if(temp.data==key){
//             return i;
//     }
//         temp=temp.next;
//         i++;
//     }
//     // key not found case
//     return -1;
//     }

//     public int helper(Node head,int key){   // time complexity takes place b/c of helper method : O(n) also space compexity is same as that of time complexity.
//         if(head==null){     // base case
//             return -1;      // key does not exist
//         }
//         if(head.data==key){     // check whether head data is eqal to key or not.
//             return 0;           //  if head data equal to key return 0.
//         }
//         int idx=helper(head.next,key);      // track whether helper method can search/find out key in the linked list(nex of head) or notl.
//         if(idx==-1){                    // if cannnot search .
//             return -1;                  // return -1.
//         }
//         return idx+1;           // if search(find out) return index+1.
//         // 1 is added b/c original index is not correct.
//     }
    
//     public int recSearch(int key){
//         return helper(head,key);
//     }
//     public static void main(String[] args) {
//         LinkedList1 ll=new LinkedList1();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.add(2,3);        // at index 2 node 9 is added.
//         ll.print();
//         System.out.println(ll.recSearch(3));   // INDEX OF 3 IS 2
//         System.out.println(ll.recSearch(10));   // 10 does not exist in linked list so -1.    
//     }
// }






// REVERSE LINKED_LIST 

// public class LinkedList1{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;         //  size is static because  node increases size which occurs in same size.
//     //   by default value of size is zero .
  


//     public void addFirst(int data){

//         // when  link list is empty i.e. no Node is present
//         // step1=create new node
//         Node newNode=new Node(data);
//         // as soon as newNode create size will increase
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         // step2:- newNode next=head
//         newNode.next=head; //:- linked list create

//         // step3:- head behave as new node
//         head=newNode;


//     }

//     public void addLast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }

//     public void print(){        // IT IS  LINEAR SO ITS TIME COMPLEXITY IS O(n).
//         if(head==null){
//             System.out.println("Linked List is empty");
//             return;
//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"-->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void add(int idx,int data){

//         // base case
//         if(idx==0){
//             addFirst(data);     // at add first both head and tail value get change
//             return;
//         }

//         Node newNode=new Node(data);            // NODE CREATION
//         size++;
//         Node temp=head;
//         int i=0;                            // IT WILL TRACK INDEX NUMBER OF TEMP VARIABLE.
//         while(i<idx-1){
//             temp=temp.next;
//             i++;
//         }
//         // i=idx-1;  temp--> prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeFirst(){
//         // while remove first  size must be change

//         // special case inside remove first
//         if(size==0){    // no change
//             System.out.println("linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1)  {     // head and tail both are same
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;

//         }

//         int val=head.data;
//         head=head.next;
//         size--;
//         return val;
//     }

//     public int removeLast(){
//         // if linked list is vacant then size will be zero
//         if(size==0){
//             System.out.println("Linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1){           // if linked list size is 1 then delete head as well as tail..
//             int val=head.data;
//             head=tail=null;             // head and tail both are null.
//             size=0;
//             return val;

//         }

//         // To reach previous Node using loop  :  i = size-2
//         Node prev=head;     // prev is initilized as head.
//         for(int i=0;i<size-2 ;i++){
//             prev=prev.next;

//         }
//         int val=prev.next.data;     // tail data :data is stored before deletion.
//         prev.next=null;             // previous next is point out as null
//         tail=prev;              // previous value is assigned to tail.
//         size--;
//         return val;             // deleted value is returned.


//     }
//     public int itrSearch(int key){              // Time complexity during iterator is O(n).
//     Node temp=head;
//     int i=0;
//     while(temp!=null){
//         if(temp.data==key){
//             return i;
//     }
//         temp=temp.next;
//         i++;
//     }
//     // key not found case
//     return -1;
//     }

//     public int helper(Node head,int key){   // time complexity takes place b/c of helper method : O(n) also space compexity is same as that of time complexity.
//         if(head==null){     // base case
//             return -1;      // key does not exist
//         }
//         if(head.data==key){     // check whether head data is eqal to key or not.
//             return 0;           //  if head data equal to key return 0.
//         }
//         int idx=helper(head.next,key);      // track whether helper method can search/find out key in the linked list(nex of head) or notl.
//         if(idx==-1){                    // if cannnot search .
//             return -1;                  // return -1.
//         }
//         return idx+1;           // if search(find out) return index+1.
//         // 1 is added b/c original index is not correct.
//     }
    
//     public int recSearch(int key){
//         return helper(head,key);
//     }


//         // To find out reverse in LikedList we need three varialble and 4 steps
//         public void reverse(){
//             Node prev=null;
//             Node curr=tail=head;            // head value is stored in both tail as well as head.
//             Node next;
//             while(curr!=null){
//                 next=curr.next;
//                 curr.next=prev;
//                 prev=curr;
//                 curr=next;
//             }
//             // b/c current becomes null so update head by previous
//             head=prev;
//         }
//     public static void main(String[] args) {
//         LinkedList1 ll=new LinkedList1();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.add(2,3);        // at index 2 node 9 is added.
//         ll.print();
//         ll.reverse();
//         ll.print();
//     }
// }





//  REMOVE ELEMENTS OF LINKED_LIST FROM OUR CHOICE



// public class LinkedList1{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;         //  size is static because  node increases size which occurs in same size.
//     //   by default value of size is zero .
  


//     public void addFirst(int data){

//         // when  link list is empty i.e. no Node is present
//         // step1=create new node
//         Node newNode=new Node(data);
//         // as soon as newNode create size will increase
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         // step2:- newNode next=head
//         newNode.next=head; //:- linked list create

//         // step3:- head behave as new node
//         head=newNode;


//     }

//     public void addLast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }

//     public void print(){        // IT IS  LINEAR SO ITS TIME COMPLEXITY IS O(n).
//         if(head==null){
//             System.out.println("Linked List is empty");
//             return;
//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"-->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void add(int idx,int data){

//         // base case
//         if(idx==0){
//             addFirst(data);     // at add first both head and tail value get change
//             return;
//         }

//         Node newNode=new Node(data);            // NODE CREATION
//         size++;
//         Node temp=head;
//         int i=0;                            // IT WILL TRACK INDEX NUMBER OF TEMP VARIABLE.
//         while(i<idx-1){
//             temp=temp.next;
//             i++;
//         }
//         // i=idx-1;  temp--> prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeFirst(){
//         // while remove first  size must be change

//         // special case inside remove first
//         if(size==0){    // no change
//             System.out.println("linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1)  {     // head and tail both are same
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;

//         }

//         int val=head.data;
//         head=head.next;
//         size--;
//         return val;
//     }

//     public int removeLast(){
//         // if linked list is vacant then size will be zero
//         if(size==0){
//             System.out.println("Linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1){           // if linked list size is 1 then delete head as well as tail..
//             int val=head.data;
//             head=tail=null;             // head and tail both are null.
//             size=0;
//             return val;

//         }

//         // To reach previous Node using loop  :  i = size-2
//         Node prev=head;     // prev is initilized as head.
//         for(int i=0;i<size-2 ;i++){
//             prev=prev.next;

//         }
//         int val=prev.next.data;     // tail data :data is stored before deletion.
//         prev.next=null;             // previous next is point out as null
//         tail=prev;              // previous value is assigned to tail.
//         size--;
//         return val;             // deleted value is returned.


//     }
//     public int itrSearch(int key){              // Time complexity during iterator is O(n).
//     Node temp=head;
//     int i=0;
//     while(temp!=null){
//         if(temp.data==key){
//             return i;
//     }
//         temp=temp.next;
//         i++;
//     }
//     // key not found case
//     return -1;
//     }

//     public int helper(Node head,int key){   // time complexity takes place b/c of helper method : O(n) also space compexity is same as that of time complexity.
//         if(head==null){     // base case
//             return -1;      // key does not exist
//         }
//         if(head.data==key){     // check whether head data is eqal to key or not.
//             return 0;           //  if head data equal to key return 0.
//         }
//         int idx=helper(head.next,key);      // track whether helper method can search/find out key in the linked list(nex of head) or notl.
//         if(idx==-1){                    // if cannnot search .
//             return -1;                  // return -1.
//         }
//         return idx+1;           // if search(find out) return index+1.
//         // 1 is added b/c original index is not correct.
//     }
    
//     public int recSearch(int key){
//         return helper(head,key);
//     }


//         // To find out reverse in LikedList we need three varialble and 4 steps
//         public void reverse(){
//             Node prev=null;
//             Node curr=tail=head;            // head value is stored in both tail as well as head.
//             Node next;
//             while(curr!=null){
//                 next=curr.next;
//                 curr.next=prev;
//                 prev=curr;
//                 curr=next;
//             }
//             // b/c current becomes null so update head by previous
//             head=prev;
//         }
//         public void deleteNthfromEnd(int n){
//             // calculate size
//             int size=0;
//             Node temp=head;
//             while(temp!=null){
//                 temp=temp.next;
//                 size++;
//             }
//             if(n==size){        // if head to be delete.
//                 head=head.next;     // To delete head or remove First elemnet Op[eration].
//                 return;

//             }
//             // size=n            
//             int i=1;
//             int indexToFind=size-n;
//             Node prev=head;
//             while(i<indexToFind){
//                 prev=prev.next;     // previous value will increase till i value becomes. 
//                 i++;
//             }
//             prev.next=prev.next.next;
//             return;
//         }
//     public static void main(String[] args) {
//         LinkedList1 ll=new LinkedList1();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.add(2,3);        // at index 2 node 9 is added.
//         ll.print();
//         // ll.reverse();
//         ll.deleteNthfromEnd(3);
//         ll.print();
//     }
// }







// //                       TO FIND OUT PALINDROME OF LINKED_LIST












// public class LinkedList1{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;         //  size is static because  node increases size which occurs in same size.
//     //   by default value of size is zero .
  


//     public void addFirst(int data){

//         // when  link list is empty i.e. no Node is present
//         // step1=create new node
//         Node newNode=new Node(data);
//         size++;
//         // as soon as newNode create size will increase
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         // step2:- newNode next=head
//         newNode.next=head; //:- linked list create

//         // step3:- head behave as new node
//         head=newNode;


//     }

//     public void addLast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }

//     public void print(){        // IT IS  LINEAR SO ITS TIME COMPLEXITY IS O(n).
//         // if(head==null){
//         //     System.out.println("Linked List is empty");
//         //     return;
//         // }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"-->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void add(int idx,int data){

//         // base case
//         if(idx==0){
//             addFirst(data);     // at add first both head and tail value get change
//             return;
//         }

//         Node newNode=new Node(data);            // NODE CREATION
//         size++;
//         Node temp=head;
//         int i=0;                            // IT WILL TRACK INDEX NUMBER OF TEMP VARIABLE.
//         while(i<idx-1){
//             temp=temp.next;
//             i++;
//         }
//         // i=idx-1;  temp--> prev
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }
//     public int removeFirst(){
//         // while remove first  size must be change

//         // special case inside remove first
//         if(size==0){    // no change
//             System.out.println("linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1)  {     // head and tail both are same
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;

//         }

//         int val=head.data;
//         head=head.next;
//         size--;
//         return val;
//     }

//     public int removeLast(){
//         // if linked list is vacant then size will be zero
//         if(size==0){
//             System.out.println("Linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1){           // if linked list size is 1 then delete head as well as tail..
//             int val=head.data;
//             head=tail=null;             // head and tail both are null.
//             size=0;
//             return val;

//         }

//         // To reach previous Node using loop  :  i = size-2
//         Node prev=head;     // prev is initilized as head.
//         for(int i=0;i<size-2 ;i++){
//             prev=prev.next;

//         }
//         int val=prev.next.data;     // tail data :data is stored before deletion.
//         prev.next=null;             // previous next is point out as null
//         tail=prev;              // previous value is assigned to tail.
//         size--;
//         return val;             // deleted value is returned.


//     }
//     public int itrSearch(int key){              // Time complexity during iterator is O(n).
//     Node temp=head;
//     int i=0;
//     while(temp!=null){
//         if(temp.data==key){
//             return i;
//     }
//         temp=temp.next;
//         i++;
//     }
//     // key not found case
//     return -1;
//     }

//     public int helper(Node head,int key){   // time complexity takes place b/c of helper method : O(n) also space compexity is same as that of time complexity.
//         if(head==null){     // base case
//             return -1;      // key does not exist
//         }
//         if(head.data==key){     // check whether head data is eqal to key or not.
//             return 0;           //  if head data equal to key return 0.
//         }
//         int idx=helper(head.next,key);      // track whether helper method can search/find out key in the linked list(nex of head) or notl.
//         if(idx==-1){                    // if cannnot search .
//             return -1;                  // return -1.
//         }
//         return idx+1;           // if search(find out) return index+1.
//         // 1 is added b/c original index is not correct.
//     }
    
//     public int recSearch(int key){
//         return helper(head,key);
//     }


//         // To find out reverse in LikedList we need three varialble and 4 steps
//         public void reverse(){
//             Node prev=null;
//             Node curr=tail=head;            // head value is stored in both tail as well as head.
//             Node next;
//             while(curr!=null){
//                 next=curr.next;
//                 curr.next=prev;
//                 prev=curr;
//                 curr=next;
//             }
//             // b/c current becomes null so update head by previous
//             head=prev;
//         }
//         public void deleteNthfromEnd(int n){
//             // calculate size
//             int size=0;
//             Node temp=head;
//             while(temp!=null){
//                 temp=temp.next;
//                 size++;
//             }
//             if(n==size){        // if head to be delete.
//                 head=head.next;     // To delete head or remove First elemnet Op[eration].
//                 return;

//             }
//             // size=n            
//             int i=1;
//             int indexToFind=size-n;
//             Node prev=head;
//             while(i<indexToFind){
//                 prev=prev.next;     // previous value will increase till i value becomes. 
//                 i++;
//             }
//             prev.next=prev.next.next;
//             return;
//         }

//         //               TO FIND OUT PALINDROME OF LINKED_LIST

//         // slow-fast approach to find out mid-node
//         public Node findMid(Node head){
//             Node slow =head;
//             Node fast=head;
//             while(fast!=null && fast.next!=null){
//                 slow=slow.next;     // slow is increased by +1.
//                 fast=fast.next.next;    // fast is increased by +2. fast pointer reaches at last.
//             }
//             return slow;    // slow pointer reach at middle as fast pointer approach last.

//         }
//         public boolean checkPalindrome(){
//             if(head==null||head.next==null){
//                 return true;

//             }
//             // Three step for reverse
//             // Step1- find mid
//             Node midNode=findMid(head);

//             // Step2- reverse 2nd half
//             Node prev=null;
//             Node curr=midNode;
//             Node next;
//             // four steps perform 
//             while(curr!=null){
//                 next=curr.next;
//                 curr.next=prev;
//                 prev=curr;
//                 curr=next;
//             }
//             Node right=prev;    // right half head is assign as prev
//             Node left=head;     // left half head is assign as head of linked list.

//             // Step -3 check left and right half

//             while(right!=null){     // traveres from backside till right half!= null.
//                 if(left.data!=right.data){
//                     return false;
//                 }
//                 left=left.next;
//                 right=right.next;
//             }
//             return true;

//         }
//     public static void main(String[] args) {
//         LinkedList1 ll=new LinkedList1();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.print();
//         System.out.println(ll.checkPalindrome());
//     }
// }






