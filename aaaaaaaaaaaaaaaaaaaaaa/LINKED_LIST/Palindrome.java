

public class Palindrome{
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
    public static int size;         //  size is static because  node increases size which occurs in same size.
    //   by default value of size is zero .
    public void addFirst(int data){

        // when  link list is empty i.e. no Node is present
        // step1=create new node
        Node newNode=new Node(data);
        // as soon as newNode create size will increase
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
        size++;
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

        // base case
        if(idx==0){
            addFirst(data);     // at add first both head and tail value get change
            return;
        }

        Node newNode=new Node(data);            // NODE CREATION
        size++;
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
                    //   TO FIND OUT PALINDROME OF LINKED_LIST

        // slow-fast approach to find out mid-node
        public Node findMid(Node head){
            Node slow =head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;     // slow is increased by +1.
                fast=fast.next.next;    // fast is increased by +2. fast pointer reaches at last.
            }
            return slow;    // slow pointer reach at middle as fast pointer approach last.

        }
        public boolean checkPalindrome(){
            if(head==null||head.next==null){
                return true;

            }
            // Three step for reverse
            // Step1- find mid
            Node midNode=findMid(head);

            // Step2- reverse 2nd half
            Node prev=null;
            Node curr=midNode;
            Node next;
            // four steps perform 
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node right=prev;    // right half head is assign as prev
            Node left=head;     // left half head is assign as head of linked list.

            // Step -3 check left and right half

            while(right!=null){     // traveres from backside till right half!= null.
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;
            }
            return true;

        }
    public static void main(String[] args) {
        Palindrome ll=new Palindrome();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}













