
// public class LinkedList
// {

//    public static class Node{
//        int data;
//        Node  next;
//        public Node(int data){
// this.data = data;
// this.next = null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//    public static int size;

//    public void addFirst(int data){
//          //step 1= create new node
//          Node newNode=new Node(data);
//          size++;
// if(head==null){
//    head=tail=newNode;
//    return;

// }
//        //step2- newNode next =head
//        newNode.next=head;//link
//        //step3-head=newNode
//        head=newNode;
//    }

// public void addLast(int data){
//     Node newNode= new Node(data);
//     size++;
//     if(head==null){
//         head=tail=newNode;
//         return;
//     }
//     tail.next=newNode;
//     tail=newNode;
// }

// public void print(){//O(n)
//     if(head==null){
//         System.out.println("LinkedList empty");
//     return;}
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+"-->");
//         temp=temp.next;
//     }
//     System.out.println("null");
// }

// public void add(int idx,int data){
//     if(idx==0){
//         addFirst(data);
//         return;
//     }
//     Node newNode=new Node(data);
//     size++;
//     Node temp=head;
//     int i=0;
//     while(i<idx-1){
//         temp=temp.next;
//         i++;
//     }
//     //i=idx-1;temp-->prev
//     newNode.next=temp.next;
//     temp.next=newNode;
// }
//     public static void main(String[] args) {
//        LinkedList l=new LinkedList();
//        l.print();
//         l.addFirst(2);
//         l.print();
//         l.addFirst(1);
//         l.print();
//         l.addLast(3);
//         l.print();
//         l.addLast(4);
//         l.print();
//         l.add(2, 9);
//         l.print();
//         System.out.println(l.size);
//     }  
// }

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step 1= create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        // step2- newNode next =head
        newNode.next = head;// link
        // step3-head=newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {// O(n)
        if (head == null) {
            System.out.println("LinkedList empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        // size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i=idx-1;temp-->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev:i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = head.data;// tail.data
        head = head.next;
        tail = prev;
        size--;
        return val;

    }

    // remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev:i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;// tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int key) {

        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                // key found
                return i;
            }

            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.addFirst(2);

        l.addFirst(1);

        l.addLast(4);

        l.addLast(5);

        l.add(2, 3);

        l.print();
        l.removeFirst();
        l.print();
        l.removeLast();
        l.print();
        System.out.println(l.size);
    }
}

// public class LinkedList
// {

// public static class Node{
// int data;
// Node next;
// public Node(int data){
// this.data = data;
// this.next = null;
// }
// }
// public static Node head;
// public static Node tail;
// public static int size;

// public void addFirst(int data){
// //step 1= create new node
// Node newNode=new Node(data);
// size++;
// if(head==null){
// head=tail=newNode;
// return;

// }

// //step2- newNode next =head
// newNode.next=head;//link
// //step3-head=newNode
// head=newNode;
// }
// public void addLast(int data){
// Node newNode= new Node(data);
// size++;
// if(head==null){
// head=tail=newNode;
// return;
// }
// tail.next=newNode;
// tail=newNode;
// }
// public void print(){//O(n)
// if(head==null){
// System.out.println("LinkedList empty");
// return;}
// Node temp=head;
// while(temp!=null){
// System.out.print(temp.data+"-->");
// temp=temp.next;
// }
// System.out.println("null");
// }

// public void add(int idx,int data){
// if(idx==0){
// addFirst(data);
// return;
// }
// Node newNode=new Node(data);
// size++;
// Node temp=head;
// int i=0;
// while(i<idx-1){
// temp=temp.next;
// i++;
// }
// //i=idx-1;temp-->prev
// newNode.next=temp.next;
// temp.next=newNode;
// }
// public int removeFirst(){
// if(size==0){
// System.out.println("LL is empty");
// return Integer.MIN_VALUE;
// }
// else if(size==1){
// int val=head.data;
// head=tail=null;
// size=0;
// return val;}
// //prev:i=size-2
// Node prev =head;
// for(int i=0;i<size-2;i++){
// prev=prev.next;
// }
// int val=head.data;//tail.data
// head=head.next;
// tail=prev;
// size--;
// return val;

// }
// // remove last
// public int removeLast(){
// if(size==0){
// System.out.println("LL is empty");
// return Integer.MIN_VALUE;
// }
// else if(size==1){
// int val=head.data;
// head=tail=null;
// size=0;
// return val;}
// //prev:i=size-2
// Node prev =head;
// for(int i=0;i<size-2;i++){
// prev=prev.next;
// }
// int val=prev.next.data;//tail.data
// prev.next=null;
// tail=prev;
// size--;
// return val;

// }

// public int itrSearch(int key){

// Node temp =head;
// int i=0;
// while(temp!=null){
// if(temp.data==key){
// //key found
// return i;
// }

// temp=temp.next;
// i++;}
// //key not found
// return -1;
// }
// public int healper(Node head,int key){
// if(head==null){
// return -1;

// }
// if(head.data==key){
// return 0;
// }
// int idx=healper(head.next,key);
// if(idx==-1){
// return -1;
// }
// return idx+1;
// }
// public int recSearch(int key){
// return healper(head, key);
// }

// public void reverse(){
// Node prev=null;
// Node curr=tail=head;
// Node next;
// while(curr!=null){
// next=curr.next;
// curr.next=prev;
// prev=curr;
// curr=next;
// }
// head=prev;
// }

// public void deleteNthFromEnd(int n){
// //calculate size
// int sz=0;
// Node temp=head;
// while(temp!=null){
// temp=temp.next;
// sz++;
// }
// if(n==sz){
// head=head.next;//remove first
// return;
// }
// int i=1;
// int iToFind=sz-n;
// Node prev=head;
// while(i<iToFind){
// prev=prev.next;
// i++;
// }
// prev.next=prev.next.next;
// return;
// }

// //slow-fast approach to find mid node
// public Node findMid(Node head){
// Node slow=head;
// Node fast=head;
// while(fast!=null&&fast.next!=null){
// slow=slow.next;//+1
// fast=fast.next.next;//+2

// }
// return slow;//slow is myMid node
// }

// public boolean checkPalindrome(){
// if(head==null||head.next==null){
// return true;
// }
// //step1-find mid
// Node midNode=findMid(head);
// //step2-reverse 2nd half
// Node prev=null;
// Node curr=midNode;
// Node next;
// while(curr!=null){
// next=curr.next;
// curr.next=prev;
// prev=curr;
// curr=next;
// }
// Node right=prev;//rigth half head
// Node left=head;
// //step3-check left half & right half
// while(right!=null){
// if(left.data!=right.data){
// return false;
// }
// left=left.next;
// right= right.next;
// }
// return true;
// }

// public static void main(String[] args) {
// LinkedList l=new LinkedList();

// // l.addFirst(2);

// // l.addFirst(1);

// // l.addLast(4);

// // l.addLast(5 );

// // l.add(2, 3);
// // l.print();
// // System.out.println(l.itrSearch(3));
// // System.out.println(l.itrSearch(10));
// // System.out.println(l.recSearch(3));
// // System.out.println(l.recSearch(10));
// // l.reverse();
// // l.print();
// // l.deleteNthFromEnd(3);
// // l.print();

// l.addFirst(1);

// l.addFirst(2);

// l.addFirst(3);

// l.addFirst(1 );
// l.print();
// System.out.println(l.checkPalindrome());

// }
// }

// import java.time.temporal.TemporalField;

// public class LinkedList
// {

// public static class Node{
// int data;
// Node next;
// public Node(int data){
// this.data = data;
// this.next = null;
// }
// }
// public static Node head;
// public static Node tail;
// public static int size;

// public void addFirst(int data){
// //step 1= create new node
// Node newNode=new Node(data);
// size++;
// if(head==null){
// head=tail=newNode;
// return;

// }

// //step2- newNode next =head
// newNode.next=head;//link
// //step3-head=newNode
// head=newNode;
// }
// public void addLast(int data){
// Node newNode= new Node(data);
// size++;
// if(head==null){
// head=tail=newNode;
// return;
// }
// tail.next=newNode;
// tail=newNode;
// }
// public void print(){//O(n)
// if(head==null){
// System.out.println("LinkedList empty");
// return;}
// Node temp=head;
// while(temp!=null){
// System.out.print(temp.data+"-->");
// temp=temp.next;
// }
// System.out.println("null");
// }

// public void add(int idx,int data){
// if(idx==0){
// addFirst(data);
// return;
// }
// Node newNode=new Node(data);
// size++;
// Node temp=head;
// int i=0;
// while(i<idx-1){
// temp=temp.next;
// i++;
// }
// //i=idx-1;temp-->prev
// newNode.next=temp.next;
// temp.next=newNode;
// }

// public static boolean isCycle(){
// Node slow =head;
// Node fast=head;
// while(fast!=null && fast.next!=null){
// slow=slow.next;//+1
// fast=fast.next.next;//+2
// if(slow==fast){
// return true;//cycle exist
// }

// }
// return false;//cycle does not exist
// }

// public static void removeCycle(){
// //detect cycle
// Node slow =head;
// Node fast=head;
// boolean cycle=false;
// while(fast!=null && fast.next!=null){
// slow=slow.next;//+1
// fast=fast.next.next;//+2
// if(slow==fast){
// cycle=true;
// break;
// }}
// if(cycle==false){
// return ;
// }
// //finding meeting point
// slow=head;
// Node prev=null;//last node
// while(slow!=fast){
// prev=fast;
// slow=slow.next;
// fast=fast.next;
// }
// //remove cycle-->last.next=null
// prev.next=null;
// }
// public static void main(String[] args) {
// // LinkedList l=new LinkedList();
// // l.print();
// // l.addFirst(1);
// // l.addFirst(2);
// // l.addFirst(3);
// // l.addFirst(1);
// // l.print();
// head=new Node(1);
// Node temp=new Node(2);
// head.next=temp;

// head.next.next=new Node(3);
// head.next.next.next=temp;

// //head.next.next.next= head;

// //1--->2-->3-->2
// System.out.println(isCycle());
// removeCycle();
// System.out.println(isCycle());

// }
// }

/* Merzed Sort */

// public class LinkedList {

// public static class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public static Node head;
// public static Node tail;
// public static int size;

// public void addFirst(int data) {
// // step 1= create new node
// Node newNode = new Node(data);
// size++;
// if (head == null) {
// head = tail = newNode;
// return;

// }

// // step2- newNode next =head
// newNode.next = head;// link
// // step3-head=newNode
// head = newNode;
// }

// public void addLast(int data) {
// Node newNode = new Node(data);
// size++;
// if (head == null) {
// head = tail = newNode;
// return;
// }
// tail.next = newNode;
// tail = newNode;
// }

// public void print() {// O(n)
// if (head == null) {
// System.out.println("LinkedList empty");
// return;
// }
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + "-->");
// temp = temp.next;
// }
// System.out.println("null");
// }

// public void add(int idx, int data) {
// if (idx == 0) {
// addFirst(data);
// return;
// }
// Node newNode = new Node(data);
// size++;
// Node temp = head;
// int i = 0;
// while (i < idx - 1) {
// temp = temp.next;
// i++;
// }
// // i=idx-1;temp-->prev
// newNode.next = temp.next;
// temp.next = newNode;
// }

// private Node getMid(Node head) {
// Node slow = head;
// Node fast = head.next;
// while (fast != null && fast.next != null) {
// slow = slow.next;
// fast = fast.next.next;

// }
// return slow;// mid node
// }

// private Node merge(Node head1, Node head2) {
// Node mergedLL = new Node(-1);
// Node temp = mergedLL;

// while (head1 != null && head2 != null) {
// if (head1.data <= head2.data) {
// temp.next = head1;
// head1 = head1.next;
// temp = temp.next;
// } else {
// temp.next = head2;
// head2 = head2.next;
// temp = temp.next;
// }
// }
// while (head1 != null) {
// temp.next = head1;
// head1 = head1.next;
// temp = temp.next;
// }
// while (head2 != null) {
// temp.next = head2;
// head2 = head2.next;
// temp = temp.next;
// }
// return mergedLL.next;
// }

// public Node mergeSort(Node head) {
// if (head == null || head.next == null) {
// return head;
// }
// // find mid
// Node mid = getMid(head);

// // left & right ms
// Node rightHead = mid.next;
// mid.next = null;
// Node newLeft = mergeSort(head);
// Node newRight = mergeSort(rightHead);
// // merge

// return merge(newLeft, newRight);
// }

// public static void main(String[] args) {
// LinkedList l = new LinkedList();
// l.addFirst(1);
// l.addFirst(2);
// l.addFirst(3);
// l.addFirst(4);
// l.addFirst(5);
// l.print();
// l.head = l.mergeSort(l.head);
// l.print();

// }
// }
